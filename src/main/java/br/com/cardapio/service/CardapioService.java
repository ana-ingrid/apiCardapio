package br.com.cardapio.service;

import br.com.cardapio.dto.CadastraComidaDTO;
import br.com.cardapio.exception.ComidaExistenteException;
import br.com.cardapio.model.Comida;
import br.com.cardapio.repository.CardapioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardapioService {

    @Autowired
    private CardapioRepository cardapioRepository;
    @Autowired
    private ModelMapper modelMapper;

    public Comida cadastraComida(CadastraComidaDTO cadastraComidaDTO) {
        List<Comida> comidaList = cardapioRepository.findByTitulo(cadastraComidaDTO.getTitulo());

        if (comidaList.isEmpty()){
            Comida comida = modelMapper.map(cadastraComidaDTO, Comida.class);
            return cardapioRepository.save(comida);
        } else {
            throw new ComidaExistenteException("Prato já existente");
        }
    }

}

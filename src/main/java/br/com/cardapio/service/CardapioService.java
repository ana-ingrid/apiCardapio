package br.com.cardapio.service;

import br.com.cardapio.dto.CadastraComidaDTO;
import br.com.cardapio.exception.RecursoExistenteException;
import br.com.cardapio.exception.RecursoNaoEncontradoException;
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
        if (cardapioRepository.findByTituloIgnoreCase(cadastraComidaDTO.getTitulo()) == null){
            Comida comida = modelMapper.map(cadastraComidaDTO, Comida.class);
            return cardapioRepository.save(comida);
        } else {
            throw new RecursoExistenteException("Prato já existente");
        }
    }

    public Comida consultaComidaPorTitulo(String titulo) {
       if (cardapioRepository.findByTituloIgnoreCase(titulo) == null){
           throw new RecursoNaoEncontradoException("Prato não encontrado");
       }
        return cardapioRepository.findByTituloIgnoreCase(titulo);
    }

    public List<Comida> listaComidas() {
        if (cardapioRepository.findAll().isEmpty()) {
            throw new RecursoNaoEncontradoException("Nenhum prato cadastrado");

        }
        return cardapioRepository.findAll();
    }


    public void deletaComida(String titulo) {
        Comida comida = cardapioRepository.findByTituloIgnoreCase(titulo);

        if (cardapioRepository.findByTituloIgnoreCase(titulo) == null){
            throw new RecursoNaoEncontradoException("Prato não encontrado");
        }
        cardapioRepository.delete(comida);
    }


}

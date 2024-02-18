package br.com.cardapio.service;

import br.com.cardapio.dto.CadastraComidaDTO;
import br.com.cardapio.exception.RecursoNaoEncontradoException;
import br.com.cardapio.model.Comida;
import br.com.cardapio.repository.CardapioRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
 class CardapioServiceTest {

    @InjectMocks
    private CardapioService cardapioService;

    @Mock
    private CardapioRepository cardapioRepository;

    @Mock
    private ModelMapper modelMapper;


    @Test
    void testCadastraComidaSucesso() {
        CadastraComidaDTO dto = new CadastraComidaDTO();
        dto.setTitulo("Lasanha");

        Comida comidaMock = new Comida();
        comidaMock.setTitulo("Lasanha");

        when(cardapioRepository.findByTituloIgnoreCase("Lasanha")).thenReturn(null);
        when(modelMapper.map(dto, Comida.class)).thenReturn(comidaMock);
        when(cardapioRepository.save(comidaMock)).thenReturn(comidaMock);

        Comida result = cardapioService.cadastraComida(dto);

        assertNotNull(result);
        assertEquals("Lasanha", result.getTitulo());
    }

    @Test
    void testCadastraComidaExecption() {
        Comida comidaMock = new Comida();
        comidaMock.setTitulo("Lasanha");

        CadastraComidaDTO dto = new CadastraComidaDTO();
        dto.setTitulo("Lasanha");

        when(cardapioRepository.findByTituloIgnoreCase("Lasanha")).thenThrow(new RecursoNaoEncontradoException("Prato já existente"));

        RecursoNaoEncontradoException exception = assertThrows(RecursoNaoEncontradoException.class, () -> {
            cardapioService.cadastraComida(dto);
        });

        assertEquals("Prato já existente", exception.getMessage());
    }

    @Test
    void testconsultaComidaSucesso() {
        Comida comidaMock = new Comida();
        comidaMock.setTitulo("Lasanha");

        when(cardapioRepository.findByTituloIgnoreCase(comidaMock.getTitulo())).thenReturn(comidaMock);
        Comida resultado = cardapioService.consultaComidaPorTitulo(comidaMock.getTitulo());

        assertEquals(comidaMock, resultado);
    }

    @Test
    void testconsultaComidaExecption() {
        when(cardapioRepository.findByTituloIgnoreCase("Lasanha")).thenThrow(new RecursoNaoEncontradoException("Prato não encontrado"));

        RecursoNaoEncontradoException exception = assertThrows(RecursoNaoEncontradoException.class, () -> {
          cardapioService.consultaComidaPorTitulo("Lasanha");
        });

        assertEquals("Prato não encontrado", exception.getMessage());
    }


}


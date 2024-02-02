package br.com.cardapio.resource;

import br.com.cardapio.dto.CadastraComidaDTO;
import br.com.cardapio.model.Comida;
import br.com.cardapio.service.CardapioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Cardapio")
public class CardapioController {

    @Autowired
    protected CardapioService cardapioService;


    @PostMapping
    public ResponseEntity<Comida> cadastraComida(@RequestBody @Valid CadastraComidaDTO comidaDTO){
        return ResponseEntity.status(201).body(cardapioService.cadastraComida(comidaDTO));
    }

    @GetMapping
    public  ResponseEntity<Comida> consultaComidaPorTitulo(@RequestParam String titulo){
        return ResponseEntity.status(200).body(cardapioService.consultaComidaPorTitulo(titulo));
    }

    @GetMapping(value = "/lista")
    public ResponseEntity<List<Comida>> listaComidas(){
        return ResponseEntity.status(200).body(cardapioService.listaComidas());
    }


}

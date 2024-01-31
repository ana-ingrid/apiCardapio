package br.com.cardapio.resource;

import br.com.cardapio.dto.CadastraComidaDTO;
import br.com.cardapio.model.Comida;
import br.com.cardapio.service.CardapioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Cardapio")
public class CardapioController {

    @Autowired
    protected CardapioService cardapioService;


    @PostMapping
    public ResponseEntity<Comida> cadastraComida(@RequestBody CadastraComidaDTO comidaDTO){
        return ResponseEntity.ok().body(cardapioService.cadastraComida(comidaDTO));
    }


}

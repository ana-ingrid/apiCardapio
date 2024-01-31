package br.com.cardapio.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CadastraComidaDTO {

    private String titulo;
    private String descricao;
    private String imagem;

    private Integer valor;


}

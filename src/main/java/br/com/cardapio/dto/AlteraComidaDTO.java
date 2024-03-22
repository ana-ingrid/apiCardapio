package br.com.cardapio.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AlteraComidaDTO {

    private String titulo;
    private String descricao;
    private String imagem;
    private Double valor;
}

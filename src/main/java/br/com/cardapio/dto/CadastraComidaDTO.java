package br.com.cardapio.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CadastraComidaDTO {

    @NotNull
    private String titulo;
    @NotNull
    private String descricao;
    @NotNull
    private String imagem;
    @NotNull
    private Double valor;


}

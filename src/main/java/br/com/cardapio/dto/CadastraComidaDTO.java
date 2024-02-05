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

    @NotNull(message = "Titulo obrigatório")
    private String titulo;

    @NotNull(message = "Descrição obrigatória")
    private String descricao;

    @NotNull(message ="Imagem obrigatória")
    private String imagem;

    @NotNull(message = "Valor obrigatório")
    private Double valor;


}

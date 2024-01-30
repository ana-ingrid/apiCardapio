package br.com.cardapio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "comidas")
@Table
public class Comida {

    @Id
    private Integer id;
    private String titulo;
    private String descricao;
    private String imagem;
    private String valor;


}

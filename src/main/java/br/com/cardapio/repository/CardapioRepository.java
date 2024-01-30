package br.com.cardapio.repository;


import br.com.cardapio.model.Comida;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardapioRepository extends JpaRepository<Comida, Integer> {

    List<Comida> findByTitulo(String titulo);

}

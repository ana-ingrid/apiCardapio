package br.com.cardapio.repository;


import br.com.cardapio.model.Comida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface CardapioRepository extends JpaRepository<Comida,Integer> {

    @Query("SELECT c FROM comidas c WHERE c.titulo = :titulo")
    Comida findByTituloIgnoreCase(@Param("titulo") String titulo);


}

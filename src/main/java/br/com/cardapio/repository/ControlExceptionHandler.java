package br.com.cardapio.repository;

import br.com.cardapio.exception.RecursoExistenteException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ControlExceptionHandler {

    @ExceptionHandler(value = RecursoExistenteException.class)
    public ResponseEntity<Object> comidaExistente(RecursoExistenteException uException, WebRequest request){
        return ResponseEntity.status(404).body(uException.getMessage());
    }

}

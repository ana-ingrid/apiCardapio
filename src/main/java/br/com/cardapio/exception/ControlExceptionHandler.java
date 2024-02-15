package br.com.cardapio.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ControlExceptionHandler {

    @ExceptionHandler(value = RecursoExistenteException.class)
    public ResponseEntity<Object> recursoExistente(RecursoExistenteException uException, WebRequest request){
        return ResponseEntity.status(400).body(uException.getMessage());
    }

    @ExceptionHandler(value = RecursoNaoEncontradoException.class)
    public ResponseEntity<Object> recursoNaoEncontrado(RecursoNaoEncontradoException uExeption, WebRequest request) {
        return ResponseEntity.status(404).body(uExeption.getMessage());
    }


}

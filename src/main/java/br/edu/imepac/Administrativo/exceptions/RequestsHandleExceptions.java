package br.edu.imepac.Administrativo.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.persistence.EntityNotFoundException;

@RestControllerAdvice
public class RequestsHandleExceptions extends Throwable {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ExceptionDTO> erro404(){
        ExceptionDTO response = new ExceptionDTO(404, "Id not found");
        return ResponseEntity.badRequest().body(response);
    }
}

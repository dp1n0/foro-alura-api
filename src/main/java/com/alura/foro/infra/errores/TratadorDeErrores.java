package com.alura.foro.infra.errores;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLIntegrityConstraintViolationException;

@RestControllerAdvice
public class TratadorDeErrores {

    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public ResponseEntity tratadorError500(SQLIntegrityConstraintViolationException e) {
        var errores = e.getMessage();
        return ResponseEntity.badRequest().body(errores);
    }

    private record DatosErrorValidacion(String campo, String error) {
        public DatosErrorValidacion(FieldError error) {
            this(
                    error.getField(),
                    error.getDefaultMessage()
            );
        }
    }
}

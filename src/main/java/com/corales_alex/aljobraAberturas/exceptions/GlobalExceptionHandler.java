// En el archivo: exceptions/GlobalExceptionHandler.java
package com.corales_alex.aljobraAberturas.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    // Maneja la excepción MamparaAlreadyExistsException
    @ExceptionHandler(MamparaAlreadyExistsException.class)
    public ResponseEntity<String> handleMamparaAlreadyExistsException(MamparaAlreadyExistsException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
    }

    // Maneja la excepción InvalidMamparaDataException
    @ExceptionHandler(InvalidMamparaDataException.class)
    public ResponseEntity<String> handleInvalidMamparaDataException(InvalidMamparaDataException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    // Maneja cualquier otra excepción genérica (opcional)
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGenericException(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                             .body("Error interno del servidor: " + ex.getMessage());
    }
}

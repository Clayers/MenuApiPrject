package com.example.menuapiproject.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MenuException.class)
    public ResponseEntity<String> handleBusinessException(MenuException ex) {
        return new ResponseEntity<>(
                ex.getMessage(),
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleOtherExceptions(Exception ex) {

        return new ResponseEntity<>(
                "Unexpected error",
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }
}

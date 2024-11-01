package com.example.practica.exception;

import com.example.practica.model.response.ExceptionHandlerResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(GeneralException.class)
    public ResponseEntity<ExceptionHandlerResponse> handleGeneralException(GeneralException ex){
        ExceptionHandlerResponse response = ExceptionHandlerResponse.builder().mensaje(ex.getMessage())
                .codigo(HttpStatus.INTERNAL_SERVER_ERROR).build();
        return new ResponseEntity<>(response,response.getCodigo());
    }

}

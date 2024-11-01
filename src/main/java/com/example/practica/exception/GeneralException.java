package com.example.practica.exception;

public class GeneralException extends RuntimeException{

    private static final long serialVersionUID = 234325423451L;

    public GeneralException(String message) {
        super(message);
    }

    public GeneralException(String message, Throwable cause) {
        super(message, cause);
    }
}

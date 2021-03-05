package com.domain.model;

public class StolenCreditCardException extends Exception {

    private static final long serialVersionUID = 1L;

    public StolenCreditCardException(String message) {
        super(message);
    }
    
}

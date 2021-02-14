package com.domain.model;

/**
 * Currency is a VALUE OBJECT in the domain model. 
 */
public class Currency {

    private String currencyCode;

    public Currency(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }
    
}
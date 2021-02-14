package com.api;

public class SubmitPaymentRequest {

    private double amount;
    private String currency;
    private String creditCardNumber;
    private String creditCardExpiration;
    private String creditCardSecurityCode;
    private String cardHolderName;

    public double getAmount() {
        return amount;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCreditCardSecurityCode() {
        return creditCardSecurityCode;
    }

    public void setCreditCardSecurityCode(String creditCardSecurityCode) {
        this.creditCardSecurityCode = creditCardSecurityCode;
    }

    public String getCreditCardExpiration() {
        return creditCardExpiration;
    }

    public void setCreditCardExpiration(String creditCardExpiration) {
        this.creditCardExpiration = creditCardExpiration;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }



}
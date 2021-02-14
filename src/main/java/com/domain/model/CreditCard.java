package com.domain.model;

import java.util.Objects;

/**
 * CreditCard is a Value Object. It doesn't have setters because
 * value objects are immutable. When checking its equality to other 
 * instances of the same type, all of its values are compared, hence
 * the need to override the `equals` and `hashCode` methods.
 */
public class CreditCard {

    private String creditCardNumber;
    private String expirationDate;
    private String securityCode;
    private String cardHolderName;

    public CreditCard(String number, String expirationDate, String securityCode, String cardHolderName) {
        this.creditCardNumber = number;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
        this.cardHolderName = cardHolderName;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard creditCard = (CreditCard) o;
        return Objects.equals(creditCardNumber, creditCard.creditCardNumber) 
               && Objects.equals(expirationDate, creditCard.expirationDate)
               && Objects.equals(securityCode, creditCard.securityCode)
               && Objects.equals(cardHolderName, creditCard.cardHolderName);
    }
}
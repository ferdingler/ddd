package com.domain.model;

import java.util.Date;

/**
 * Transaction is an ENTITY in the domain model. A transaction is not 
 * defined by its attributes, but rather by its identity. It must be 
 * distinguished from other transactions even though they might have 
 * the same attributes. Consider 2 transactions of the same amount
 * with the same credit card on the same day, they are still different
 * transactions and should be distinguished from each other by its ID. 
 */
public class Transaction {

    private String transactionId;
    private Date timestamp;
    private double amount;
    private Currency currency;
    private CreditCard creditCard;

    public String getTransactionId() {
        return transactionId;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    
}
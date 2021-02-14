package com.domain.model;

import java.util.Date;

public class Transaction {

    private String transactionId;
    private Date timestamp;
    private double amount;

    public String getTransactionId() {
        return transactionId;
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
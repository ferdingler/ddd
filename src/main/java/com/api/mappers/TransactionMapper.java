package com.api.mappers;

import javax.inject.Singleton;

import com.domain.model.Transaction;
import com.api.TransactionInfo;

@Singleton
public class TransactionMapper {

    public TransactionInfo mapTransaction(Transaction transaction) {
        TransactionInfo transactionInfo = new TransactionInfo();
        transactionInfo.setAmount(transaction.getAmount());
        transactionInfo.setCurrency(transaction.getCurrency().getCurrencyCode());
        transactionInfo.setTimestamp(transaction.getTimestamp().toString());
        transactionInfo.setTransactionId(transaction.getTransactionId());
        transactionInfo.setCreditCardNumber(transaction.getCreditCard().getCreditCardNumber());
        transactionInfo.setCreditCardExpiration(transaction.getCreditCard().getExpirationDate());
        transactionInfo.setCreditCardSecurityCode(transaction.getCreditCard().getSecurityCode());
        transactionInfo.setCardHolderName(transaction.getCreditCard().getCardHolderName());
        return transactionInfo;
    }
    
}

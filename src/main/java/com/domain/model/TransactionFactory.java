package com.domain.model;

import java.util.Date;
import java.util.UUID;

import com.api.SubmitPaymentRequest;

public class TransactionFactory {

    public static Transaction buildTransactionFromPaymentRequest(SubmitPaymentRequest request) {
        Transaction transaction = new Transaction();
        transaction.setTransactionId(UUID.randomUUID().toString());
        transaction.setAmount(request.getAmount());
        transaction.setTimestamp(new Date());

        CreditCard creditCard = new CreditCard(
            request.getCreditCardNumber(),
            request.getCreditCardExpiration(),
            request.getCreditCardSecurityCode(),
            request.getCardHolderName()
        );

        transaction.setCreditCard(creditCard);
        return transaction;
    }
    
}
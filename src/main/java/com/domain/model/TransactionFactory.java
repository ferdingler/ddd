package com.domain.model;

import java.util.Date;
import java.util.UUID;

import com.api.SubmitPaymentRequest;

/**
 * When the creation of a domain object becomes complicated or reveals
 * too much of the internal structure, Factories provide encapsulation.
 * 
 * Factories are particularly useful for AGGREGATES because you can hide
 * the construction of the internal objects that compose an AGGREGATE Entity
 * in a single method that can be reused in other layers. This hides the
 * implementation of the interior of the AGGREGATE from any external client.
 * 
 * Why not use the Constructor in the Transaction class to build an object?
 * 
 * Given that the Transaction object is an AGGREGATE composed of other objects
 * like the CreditCard, you should avoid calling constructors within constructors
 * of other classes. Constructors should be dead simple. Complex assemblies call
 * for factories. 
 */
public class TransactionFactory {

    public static Transaction buildTransactionFromPaymentRequest(SubmitPaymentRequest request) {
        Transaction transaction = new Transaction();
        transaction.setTransactionId(UUID.randomUUID().toString());
        transaction.setAmount(request.getAmount());
        transaction.setTimestamp(new Date());

        Currency currency = new Currency(request.getCurrency());
        transaction.setCurrency(currency);

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
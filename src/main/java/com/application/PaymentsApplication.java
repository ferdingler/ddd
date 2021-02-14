package com.application;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.api.SubmitPaymentRequest;
import com.api.TransactionInfo;
import com.domain.model.Transaction;
import com.domain.model.TransactionFactory;
import com.domain.model.TransactionRepository;

@Singleton
public class PaymentsApplication {

    @Inject
    private TransactionRepository transactionRepository;

    public String submitPayment(SubmitPaymentRequest paymentRequest) {
        Transaction transaction = TransactionFactory.buildTransactionFromPaymentRequest(paymentRequest);
        transactionRepository.saveTransaction(transaction);
        return transaction.getTransactionId();
    }

    public TransactionInfo getTransaction(String transactionId) {
        Transaction transaction = transactionRepository.getTransactionById(transactionId);
        
        TransactionInfo transactionInfo = new TransactionInfo();
        transactionInfo.setAmount(transaction.getAmount());
        transactionInfo.setTimestamp(transaction.getTimestamp().toString());
        transactionInfo.setTransactionId(transaction.getTransactionId());
        transactionInfo.setCreditCardNumber(transaction.getCreditCard().getCreditCardNumber());
        transactionInfo.setCreditCardExpiration(transaction.getCreditCard().getExpirationDate());
        transactionInfo.setCreditCardSecurityCode(transaction.getCreditCard().getSecurityCode());
        transactionInfo.setCardHolderName(transaction.getCreditCard().getCardHolderName());

        return transactionInfo;
    }
    
}
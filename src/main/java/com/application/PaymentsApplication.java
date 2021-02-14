package com.application;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.api.SubmitPaymentRequest;
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
    
}
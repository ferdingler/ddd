package com.application;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.api.SubmitPaymentRequest;
import com.api.TransactionInfo;
import com.api.mappers.TransactionMapper;
import com.domain.model.StolenCreditCardException;
import com.domain.model.Transaction;
import com.domain.model.CreditCard;
import com.domain.model.TransactionFactory;
import com.domain.model.TransactionRepository;
import com.domain.services.FraudPreventionService;

/**
 * The PaymentsApplication is part of the application layer and it contains methods
 * that represent the different `usecases` of the application. Like submit payment
 * or getTransactionById. Classes in this layer are coordinators that control the
 * flow of requests but donare not responsible for any business logic. 
 */
@Singleton
public class PaymentsApplication {

    @Inject
    private TransactionRepository transactionRepository;

    @Inject
    private TransactionMapper transactionMapper;

    @Inject
    private FraudPreventionService fraudPreventionService;

    public String submitPayment(SubmitPaymentRequest paymentRequest) throws StolenCreditCardException {
        Transaction transaction = TransactionFactory.buildTransactionFromPaymentRequest(paymentRequest);
        
        CreditCard creditCard = transaction.getCreditCard();
        if (fraudPreventionService.isCreditCardStolen(creditCard)) {
            throw new StolenCreditCardException("This credit card has been reported as stolen");
        }

        transactionRepository.saveTransaction(transaction);
        return transaction.getTransactionId();
    }

    public TransactionInfo getTransaction(String transactionId) {
        Transaction transaction = transactionRepository.getTransactionById(transactionId);
        return transactionMapper.mapTransaction(transaction);
    }
    
}
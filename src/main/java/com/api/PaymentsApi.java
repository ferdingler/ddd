package com.api;

import javax.inject.Inject;

import com.application.PaymentsApplication;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;

/**
 * The API or Presentation Layer is responsible for giving information
 * to the external user and interpreting its commands. The external user
 * might be another computer system, not necessarily a human user.
 * 
 * The inputs and outputs of this layer *must* never be Domain Model objects.
 * Exposing the Domain Model to external users will introduce inflexibility
 * to refactor it without breaking external clients. Instead, we use specific
 * DTO (Data Transfer Objects) to receive inputs from the user and to provide
 * outputs.
 */
@Controller("/payments") 
public class PaymentsApi {

    @Inject
    private PaymentsApplication paymentsApplication;

    @Post(produces = MediaType.APPLICATION_JSON) 
    public SubmitPaymentResponse submitPayment(SubmitPaymentRequest request) {
        String transactionId = paymentsApplication.submitPayment(request);
        
        SubmitPaymentResponse response = new SubmitPaymentResponse();
        response.setTransactionId(transactionId);
        return response;
    }

    @Get("/{transactionId}")
    @Produces(MediaType.APPLICATION_JSON)
    public TransactionInfo getTransaction(@PathVariable String transactionId) {
        return paymentsApplication.getTransaction(transactionId);
    }
}
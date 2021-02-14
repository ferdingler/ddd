package com.api;

import javax.inject.Inject;

import com.application.PaymentsApplication;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

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
}
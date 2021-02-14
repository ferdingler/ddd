package com.application;

import javax.inject.Singleton;

import com.api.SubmitPaymentRequest;

@Singleton
public class PaymentsApplication {

    public String submitPayment(SubmitPaymentRequest paymentRequest) {
        return "123";
    }
    
}
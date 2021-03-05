package com.infrastructure.services;

import javax.inject.Singleton;
import java.util.Random;

import com.domain.model.CreditCard;
import com.domain.services.FraudPreventionService;

@Singleton
public class FraudPreventionServiceImpl implements FraudPreventionService {

    @Override
    public boolean isCreditCardStolen(CreditCard creditCard) {
        /**
         * For the sake of the example, this is a dummy implementation
         * that randomly returns true or false. In a real application, this 
         * is where you would invoke an external service to determine 
         * if the credit card is reported as stolen or not. 
         */
        Random rand = new Random();
        return rand.nextBoolean();
    }
    
}

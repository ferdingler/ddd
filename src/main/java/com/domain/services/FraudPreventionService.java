package com.domain.services;

import com.domain.model.CreditCard;

/**
 * Fraud prevention is an important part of our business logic and therefore
 * this interface must live in our Domain. However, we declare this as an
 * interface because the implementation of how to determine whether a
 * credit card is stolen or not should be part of the infrastructure details,
 * and not in the domain.  
 */
public interface FraudPreventionService {

    boolean isCreditCardStolen(CreditCard creditCard);

}

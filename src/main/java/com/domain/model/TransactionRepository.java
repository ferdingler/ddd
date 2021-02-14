package com.domain.model;

/**
 * A Repository in DDD acts as a collection for domain entities.
 * It abstracts away the underlying infrastructure (database) allowing 
 * you to keep your domain model free of infrastructure details.
 */
public interface TransactionRepository {

    /**
     * Saves a new transaction in the database.  
     * @param transaction
     */
    void saveTransaction(Transaction transaction);

    /**
     * Returns a transaction based on the provided Id.
     * Throws an exception if the transaction is not found.
     * 
     * @param transactionId
     * @return
     */
    Transaction getTransactionById(String transactionId);
    
}
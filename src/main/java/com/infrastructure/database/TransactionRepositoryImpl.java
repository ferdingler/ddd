package com.infrastructure.database;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import com.domain.model.Transaction;
import com.domain.model.TransactionRepository;

@Singleton
public class TransactionRepositoryImpl implements TransactionRepository {

    private List<Transaction> transactions;

    public TransactionRepositoryImpl() {
        this.transactions = new ArrayList<Transaction>();
    }

    @Override
    public void saveTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    @Override
    public Transaction getTransactionById(String transactionId) {
        
        for (Transaction transaction : transactions) {
            if (transaction.getTransactionId().equals(transactionId)) {
                return transaction;
            }
        }
        
        throw new RuntimeException("Transaction not found");
    }
    
}
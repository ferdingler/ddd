package com.infrastructure.database;

import java.util.List;

import com.domain.model.Transaction;
import com.domain.model.TransactionRepository;

public class TransactionRepositoryImpl implements TransactionRepository {

    private List<Transaction> transactions;

    @Override
    public void saveTransaction(Transaction transaction) {
        transactions.add(transaction);
    }
    
}
package com.moneypad.restservices.moneypadrestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moneypad.restservices.moneypadrestapp.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}

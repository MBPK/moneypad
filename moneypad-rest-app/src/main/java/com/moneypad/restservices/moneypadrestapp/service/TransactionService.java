package com.moneypad.restservices.moneypadrestapp.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moneypad.restservices.moneypadrestapp.entity.Transaction;
import com.moneypad.restservices.moneypadrestapp.repository.TransactionRepository;

@Service
@Transactional
public class TransactionService {
	@Autowired
	private TransactionRepository repo;

	public List<Transaction> listAll() {
		return repo.findAll();
	}

	public Transaction add(Transaction transaction) {
		transaction.setEntry_time(new Date());
		Transaction savedTransaction = repo.save(transaction);
		return savedTransaction;
	}

	public Transaction get(Integer id) {
		Transaction response = null;
		try {
			response = repo.findById(id).get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}

	public String delete(Integer id) {
		String response = "Transaction deleted successfully";
		try {
			repo.findById(id).get();
			repo.deleteById(id);
		} catch (Exception e) {
			response = "Transaction with given Id doesn't exist";
			e.printStackTrace();
		}
		return response;
	}

	public String update(Transaction transaction) {
		String response = "Transaction updated successfully";
		try {
			Transaction temp = repo.findById(transaction.getId()).get();
			temp.setAmount(transaction.getAmount());
			temp.setDate(transaction.getDate());
			temp.setEntry_time(new Date());
			temp.setType(transaction.getType());
			repo.save(temp);
		} catch (Exception e) {
			response = "Transaction with given Id doesn't exist";
			e.printStackTrace();
		}
		return response;
	}
}

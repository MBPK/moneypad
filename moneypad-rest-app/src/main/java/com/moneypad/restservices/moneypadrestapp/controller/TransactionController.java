package com.moneypad.restservices.moneypadrestapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.moneypad.restservices.moneypadrestapp.entity.Transaction;
import com.moneypad.restservices.moneypadrestapp.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	private TransactionService transactionService;

	@PostMapping(path = "/transactions")
	public Transaction addTransaction(@RequestBody Transaction transaction) {
		return transactionService.add(transaction);
	}

	@GetMapping(path = "/transactions")
	public List<Transaction> getAll() {
		return transactionService.listAll();
	}

	@GetMapping(path = "/transactions/{id}")
	public Transaction getById(@PathVariable int id) {
		return transactionService.get(id);
	}

	@DeleteMapping(path = "/transactions/{id}")
	public String deleteById(@PathVariable int id) {
		return transactionService.delete(id);
	}

	@PutMapping(path = "/transactions")
	public String updateTransaction(@RequestBody Transaction transaction) {
		return transactionService.update(transaction);
	}
}

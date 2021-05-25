package com.moneypad.restservices.moneypadrestapp.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private Integer amount;

	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date entry_time;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date date;

	private boolean type;

	public Transaction() {
	}

	public Transaction(Integer amount, Date date, boolean type) {
		this.amount = amount;
		this.date = date;
		this.type = type;
		this.entry_time = new Date();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean getType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public Date getEntry_time() {
		return entry_time;
	}

	public void setEntry_time(Date entry_time) {
		this.entry_time = entry_time;
	}
}

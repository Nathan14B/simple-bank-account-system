package model.entities;

import model.exceptions.NonPositiveAmountException;

public class Account {
	private String name;
	private double balance;
	
	public Account(String name, double initialDeposit) {
		if (initialDeposit <= 0.0) {
			throw new NonPositiveAmountException("The amount for the initial deposit must be greater than zero!");
		}
		
		this.name = name;
		balance = initialDeposit;
	}
	
	public Account(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double depositAmount) {
		if (depositAmount <= 0.0) {
			throw new NonPositiveAmountException("The amount to deposit must be greater than zero!");
		}
		
		balance += depositAmount;
	}
}

package com.nexttech.accounts;

import com.nexttech.digital_bank.Client;

public abstract class Account {
	
	
	private final int agency = 1;
	private Client client;
	protected int number;
	protected double balance = 0;
	
	public Account(Client client) {
		this.client = client;
	}
	
	public int getAgency() {
		return agency;
	}
	
	public int getNumber() {
		return number;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void withdraw(int value) {
		if(this.balance >= value) {
			this.balance -= value;
			System.out.println("Saque realizado com sucesso!");
		} else {
			System.out.println("Não tem saldo suficiente!");
		}
	}
	
	public void deposit(int value) {
		this.balance += value;
		System.out.println("Deposito realizado com sucesso!");
	}
	
	public void transfer(int value, Account destAccount) {
		if(value > this.balance) {
			System.out.println("Não tem saldo suficiente!");
		} else {
			this.withdraw(value);
			destAccount.deposit(value);
			System.out.println("Transferencia realizada!");
		}
	}
	
	public void printDetails() {
		
	}
	
	public void printBasicDetails() {
		System.out.println("Titular: " + this.client.getName() + "\n"
		+ "Agencia: " + this.getAgency() + "\n" 
		+ "Conta: " + this.getNumber() + "\n"
		+ "Saldo: " + this.getBalance() + "\n");
	}
	
}

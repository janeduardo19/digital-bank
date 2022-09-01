package com.nexttech.accounts;

import com.nexttech.digital_bank.Client;

public class SavingsAccount extends Account{

	private static int SEQUENCIAL = 1;

	public SavingsAccount(Client client) {
		super(client);
		super.number = SEQUENCIAL++;
	}
	
	@Override
	public void printDetails() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.printBasicDetails();
	}
}

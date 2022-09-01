package com.nexttech.digital_bank;

import java.util.List;

import com.nexttech.accounts.Account;

public class Bank {
	private String name;
	private List<Account> accounts;  

	public Bank(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}

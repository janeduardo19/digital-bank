package com.nexttech.main;

import com.nexttech.accounts.Account;
import com.nexttech.accounts.CheckingAccount;
import com.nexttech.accounts.SavingsAccount;
import com.nexttech.digital_bank.Client;

public class Main {

	public static void main(String[] args) {
		Client yasmin = new Client("Yasmin");
		
		Account ca = new CheckingAccount(yasmin);
		Account sa = new SavingsAccount(yasmin);
		
		ca.printDetails();
		sa.printDetails();
		
		ca.deposit(200);
		ca.printDetails();
		ca.transfer(50, sa);
		ca.printDetails();
		sa.printDetails();

		
	}

}

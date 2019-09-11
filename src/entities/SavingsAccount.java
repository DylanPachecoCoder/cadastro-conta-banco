package entities;

import interfaces.Account;

public class SavingsAccount extends Account {


	public SavingsAccount(Client client, String password) {
		super(client, password);
	}

	@Override
	public void deposit(double value) {
		super.balance += value;
	}

}

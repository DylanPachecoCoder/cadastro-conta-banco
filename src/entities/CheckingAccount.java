package entities;

import exception.InsufficientFundsException;

public class CheckingAccount extends Account implements Taxable {

	public CheckingAccount(Client client, String password) {
		super(client, password);
	}

	@Override
	public void toWithdraw(double value) throws InsufficientFundsException{
		value += 0.2;
		super.toWithdraw(value);
	}

	@Override
	public void deposit(double value) {
		super.balance += value;
	}

	@Override
	public double getSalaryValue() {
		return 0;
	}
	
}

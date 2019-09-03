package entities;
public class SavingsAccount extends Account {


	public SavingsAccount(Client client) {
		super(client);
	}

	@Override
	public void deposit(double value) {
		super.balance += value;
	}

}

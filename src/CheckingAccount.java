
public class CheckingAccount extends Account implements Taxable {

	public CheckingAccount(int agency, int number) {
		super(agency, number);
	}

	@Override
	public boolean toWithdraw(double value) {
		value += 0.2;
		return super.toWithdraw(value);
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

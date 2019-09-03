
public class SavingsAccount extends Account {

	public SavingsAccount(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.balance += valor;
	}

}

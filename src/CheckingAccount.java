
public class CheckingAccount extends Account implements Taxable {

	public CheckingAccount(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public boolean saca(double valor) {
		valor += 0.2;
		return super.saca(valor);
	}

	@Override
	public void deposita(double valor) {
		super.balance += valor;
	}

	@Override
	public double getValorSalario() {
		return 0;
	}
	
}

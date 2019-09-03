
public class TaxCalculator {
	
	private double valorImposto;
	
	public double getValorImposto() {
		return this.valorImposto;
	}

	public void calculaImposto(Taxable tributavel) {
		this.valorImposto = tributavel.getValorSalario();
	}
	
}

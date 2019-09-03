
public class TaxCalculator {
	
	private double TaxValue;
	
	public double getValorImposto() {
		return this.TaxValue;
	}

	public void calculaImposto(Taxable tributavel) {
		this.TaxValue = tributavel.getValorSalario();
	}
	
}

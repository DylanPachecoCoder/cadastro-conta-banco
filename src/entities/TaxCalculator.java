package entities;

public class TaxCalculator {
	
	private double TaxValue;
	
	public double getTaxValue() {
		return this.TaxValue;
	}

	public void calculateTax(Taxable taxable) {
		this.TaxValue = taxable.getSalaryValue();
	}
	
}

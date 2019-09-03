
public class CalculadorDeImposto {
	
	private double valorImposto;
	
	public double getValorImposto() {
		return this.valorImposto;
	}

	public void calculaImposto(Tributavel tributavel) {
		this.valorImposto = tributavel.getValorSalario();
	}
	
}

public class Program {

	public static void main(String[] args) {
		
		CheckingAccount contaCorrente = new CheckingAccount(111, 111);
		contaCorrente.deposita(100);
		
		SavingsAccount contaPoupanca = new SavingsAccount(222, 222);
		contaPoupanca.deposita(200);
		
		contaCorrente.transfere(10, contaPoupanca);
		
		System.out.println("CC: " + contaCorrente.getSaldo());
		
		System.out.println("CP: " + contaPoupanca.getSaldo());
		
	}
	
}

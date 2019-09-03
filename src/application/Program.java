package application;

import entities.CheckingAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		CheckingAccount checkingAccount = new CheckingAccount(111, 111);
		checkingAccount.deposit(100);
		
		SavingsAccount savingsAccount = new SavingsAccount(222, 222);
		savingsAccount.deposit(200);
		
		checkingAccount.transfer(10, savingsAccount);
		
		System.out.println("CA: " + checkingAccount.getBalance());
		
		System.out.println("SA: " + savingsAccount.getBalance());
		
	}
	
}

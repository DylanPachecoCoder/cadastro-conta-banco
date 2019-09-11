package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.CheckingAccount;
import entities.Client;
import interfaces.Account;

public class TesteCompare {

	public static void main(String[] args) {

		List<Account> accounts = new ArrayList<>();

		Client client1 = new Client("Marcello");
		Account checkingAccount1 = new CheckingAccount(client1, "1111");
		Client client2 = new Client("Dylan");
		Account checkingAccount2 = new CheckingAccount(client2, "1111");

		accounts.add(checkingAccount1);
		accounts.add(checkingAccount2);

		for (Account account : accounts) {
			System.out.println(account);
		}

		// classe anônima
		accounts.sort(
				(Account account1, Account account2) -> account1.getClient().getName().compareTo(account2.getClient().getName())
		);

		// Collections.sort(accounts);
		// Collections.reverse(accounts);
		// Collections.shuffle(accounts);
		
		accounts.forEach((account) -> System.out.println(account));

	}

}

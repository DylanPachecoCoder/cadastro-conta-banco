package application;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.CheckingAccount;
import entities.Client;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) throws ParseException, IOException {

		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Account> accounts = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int option;
		boolean flag = true;

		do {
			
			UI.clearScreen();
			System.out.println("\tMENU");
			System.out.println();
			System.out.println("1 - Login");
			System.out.println("2 - Create an Account");
			System.out.println("3 - Show Accounts");
			System.out.println("4 - Exit");
			System.out.println();

			System.out.print("Select the option number you want: ");

			option = sc.nextInt();

			switch (option) {
		
				case 1: {
					UI.clearScreen();
					break;
				}case 2:{
					UI.clearScreen();
					System.out.println("Enter your name: ");
					sc.nextLine();
					String name = sc.nextLine();
					System.out.println();
					System.out.println("Enter your cpf: ");
					String cpf = sc.nextLine();
					System.out.println();
					System.out.println("Enter your date of birth: (dd/MM/yyyy): ");
					Date date = sdf.parse(sc.next());
					System.out.println();
					System.out.println("Enter your profession: ");
					sc.nextLine();
					String profession = sc.nextLine();

					System.out.println();
					System.out.println("1 - Checking Account");
					System.out.println("2 - Savings Account");
					System.out.println();
					System.out.print("Enter the option number you want to open the account: ");
					option = sc.nextInt();
					
					switch(option) {
						case 1:{
							UI.clearScreen();
							Client client = new Client(name, cpf, profession, date, "Checking Account");
							CheckingAccount checkingAccount = new CheckingAccount(client);
							System.out.println(checkingAccount);
							accounts.add(checkingAccount);
							System.in.read();
							break;
						}case 2:{
							UI.clearScreen();
							Client client = new Client(name, cpf, profession, date, "Savings Account");
							SavingsAccount savingsAccount = new SavingsAccount(client);
							System.out.println(savingsAccount);
							accounts.add(savingsAccount);
							System.in.read();
							break;
						}
					}
					break;
					
				}case 3:{
					UI.clearScreen();
					for(Account account : accounts) {
						System.out.println(account);
						System.out.println();
					}
					System.in.read();
					break;
					
				}case 4:{
					flag = false;
					break;
					
				}default:{
					System.out.println("Invalid Number !");
					System.in.read();
					break;
				}
			}

		} while (flag);
		sc.close();
	
		
	}

}

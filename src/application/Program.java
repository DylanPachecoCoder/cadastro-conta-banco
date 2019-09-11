package application;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CheckingAccount;
import entities.Client;
import entities.SavingsAccount;
import interfaces.Account;

public class Program {

	public static void main(String[] args) throws ParseException, IOException {

		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Account> accounts = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String password;
		
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
					for(int i = 0; i<3; i++) {
						System.out.println("Enter your name: ");
						sc.nextLine();
						String name = sc.nextLine();
						System.out.println("Enter your password: ");
						password = sc.nextLine();
						System.out.println(" pass: "+password);
						Client client = new Client(name);
						Account account = new CheckingAccount(client, password);
					
						if(accounts.contains(account)) {
							
							System.out.println("Login realizado com sucesso");
						}else {
							System.out.println("Nome e/ou senha inválido");
						}
						
					}
					System.out.println("");
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
					System.out.println("Enter your password: ");
					password = sc.nextLine();
					System.out.println(" pass: " + password);

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
							Account checkingAccount = new CheckingAccount(client, password);
							System.out.println(checkingAccount);
							accounts.add(checkingAccount);
							System.in.read();
							break;
						}case 2:{
							UI.clearScreen();
							Client client = new Client(name, cpf, profession, date, "Savings Account");
							Account savingsAccount = new SavingsAccount(client, password);
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

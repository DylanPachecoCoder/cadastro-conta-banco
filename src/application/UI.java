package application;

import java.util.Scanner;

public class UI {
	
	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	
	public static void displayMenu() {
		
		int option;
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);

		
		do {
			
			UI.clearScreen();
			System.out.println("\tMENU");
			System.out.println();
			System.out.println("1 - Login");
			System.out.println("2 - Create an Account");
			System.out.println("3 - Delete Account");
			System.out.println("4 - Exit");
			System.out.println();

			System.out.print("Select the option number you want: ");

			option = sc.nextInt();

			switch (option) {
		
				case 1: {
					break;
				}case 2:{
					break;
				}case 3:{
					break;
				}case 4:{
					flag = false;
					break;
				}
			}

		} while (flag);
		
	}
}

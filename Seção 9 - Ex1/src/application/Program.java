package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
		Account account;	
		
		if(resp == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, name, initialDeposit);
		}else account = new Account(number,name);
		
		System.out.println("Account data: ");		
		System.out.println(account.toString());
		
		System.out.println("Enter deposit value: ");
		double value = sc.nextDouble();
		account.deposit(value);
		System.out.println("Updated account data: ");
		System.out.println(account.toString());
		
		System.out.println("Enter a withdraw value: ");
		value = sc.nextDouble();
		account.withdraw(value);
		System.out.println("Updated account data: ");
		System.out.println(account.toString());
		
		sc.close();
	}

}

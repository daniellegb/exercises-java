package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter products quantity: ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.println("Enter product name: ");
			String name = sc.nextLine();
			System.out.println("Enter product price: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		
		for(int i=0; i<vect.length ; i++) {
			sum += vect[i].getPrice();
		}
		
		System.out.println("AVERAGE PRICE: " + sum/n);
		
		sc.close();
		
	}

}

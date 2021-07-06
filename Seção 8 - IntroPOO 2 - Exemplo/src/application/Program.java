package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product();
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		p.name = sc.nextLine();
		p.price = sc.nextDouble();
		p.quantity = sc.nextInt();
		
		System.out.println("Product data: " + p.name + ", $" + p.price + ", " + p.quantity + " units, Total: " + p.totalValueInStock());
		System.out.println(p);
		
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		p.addProducts(quantity);
		System.out.println(p);
		
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();		
		p.removeProducts(quantity);
		
		System.out.println(p);
		
	}

}

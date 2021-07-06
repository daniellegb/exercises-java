package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double howMany = sc.nextDouble();
		
		System.out.printf("%.2f",CurrencyConverter.convert(price, howMany));
		
	}

}

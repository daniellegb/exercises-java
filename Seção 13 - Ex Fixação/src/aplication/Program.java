package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("E-mail: ");
		String email = sc.nextLine();
		System.out.println("Birth date (DD/MM/YYYY): ");
		String birth = sc.nextLine();
		Client client = new Client(name, email, sdf.parse(birth));
		
		System.out.println("Enter data order: ");
		System.out.println("Status");
		String status = sc.nextLine();
		Order order = new Order(new Date(System.currentTimeMillis()),OrderStatus.valueOf(status), client);
		
		System.out.println("How many items to this order? ");
		int number = sc.nextInt();

		for(int i=1; i<=number; i++) {
			System.out.println("Enter #" + i + " item data: ");
			System.out.println("Product name: ");
			String productName = sc.next();
			System.out.println("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
			order.addItem(new OrderItem(quantity, productPrice, new Product(productName,productPrice)));
		}
		
		System.out.println("ORDER SUMARY: ");
		System.out.println(order.toString());
		
		sc.close();

	}

}

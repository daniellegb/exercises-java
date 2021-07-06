package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("How mahy rooms will be rented?");
			int n = sc.nextInt();
			Rent[] rent = new Rent[10];
			
			for(int i=0;i<n;i++) {
				sc.nextLine();
				System.out.println("Name: ");
				String name = sc.nextLine();
				System.out.println("E-mail: ");
				String email = sc.nextLine();
				System.out.println("Room: ");
				int room = sc.nextInt();
				rent[room] = new Rent(room, name, email);
			}
			System.out.println("Busy rooms: ");
			for(int i=0; i<rent.length; i++) {
				if(rent[i] != null) {
					System.out.println(rent[i]);
				}

			}
			sc.close();
			
	}
}

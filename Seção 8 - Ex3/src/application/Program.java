package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;

public class Program {
	
	public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Name:");
		aluno.name = sc.nextLine();
		System.out.println("Nota 1: ");
		aluno.n1 = sc.nextDouble();
		System.out.println("Nota 2: ");
		aluno.n2 = sc.nextDouble();
		System.out.println("Nota 3: ");
		aluno.n3 = sc.nextDouble();
		
		System.out.println(aluno.toString());
		
		sc.close();
		
	}

}

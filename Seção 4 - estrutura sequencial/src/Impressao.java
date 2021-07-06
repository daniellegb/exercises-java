import java.util.Locale;
import java.util.Scanner;

public class Impressao {

	public static void main(String[] args) {
		/*
		//Aula 23: Saída de dados em JAVA:
		double x = 10.53637839;
		System.out.println(x);
		// Impressão formatada para duas casa decimais
		System.out.printf("%.2f%n",x);
		Locale.setDefault(Locale.US);
		System.out.printf("O número dobrado é: %.2f %n", x + x);
		String nome = "John";
		System.out.printf("%s recebeu %.2f %n", nome, x);
		System.out.println();
		//Exercícios:
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		System.out.println(product1 + " which price is: " + price1);
		System.out.println(product2 + " which price is: " + price2);
		System.out.println();
		System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);
		System.out.println();
		System.out.printf("Measure with eight decimal places: %.8f %n" , measure);
		System.out.printf("Rouded (three decimal places): %.3f %n" , measure);
		System.out.printf("US decimal point: %.3f" , measure);
		System.out.println();
		System.out.println();
		
		//Aula 24 - Casting
		int a = 5;
		int b = 2;
		double resultado = a / b;
		System.out.println("Resultado 1 = " + resultado);
		resultado = (double) a / b;
		System.out.println("Resultado com casting = " + resultado);
		double c = 3.3;
		int d = (int) c;
		System.out.println("Casting de " + c + " double para int (perde valor) = " + d);
		
		//Aula 25 - Entrada de dados:
		Scanner sc = new Scanner(System.in);
		String t;
		t = sc.next();
		int n = sc.nextInt();
		double doub = sc.nextDouble();
		char ch = sc.next().charAt(0);
		System.out.println("Você digitou: " + t + " e o número: " +n + " e o double: " + doub);
		
		//Aula 26 - Problema da entrada padrão do nextLine():
		Scanner sc = new Scanner(System.in);
		String s1, s2, s3;
		int x = sc.nextInt();
		sc.nextLine(); // <- consome a quebra de linha! (limpa o buffer de leitura)
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();
		*/ 
		
		//Aula 27 - Algumas funções matemáticas:
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		A = Math.sqrt(x); // var A recebe raíz quadrada de x
		B = Math.pow(x, y); // var A recebe o resultado de x elevado a y
		C = Math.abs(x); //var A recebe o valor absoluto de x
		System.out.println(C);
	}

}

import java.util.Scanner;

public class ExemploDeMetodo {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com 3 números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a,b,c);
		
		showResult(maior);
		
		/*
		if (a>b && a>c) {
			System.out.println("Maior: " + a);
		}
		else if(b>c) {
			System.out.println("Maior: " + b);
		}
		else
			System.out.println("Maior: " + c);
		*/
		
		sc.close();
		
	}
	
	//Função com tipo retorna valor:
	public static int max(int x, int y, int z) {
		int aux;
		if (x>y && y>z) {
			aux = x;
		}
		else if(y>z) {
			aux = y;
		}
		else
			aux = z;
		return aux;
	}
	
	//Função vazia (void) realiza ação, mas não retorna valor:
	public static void showResult(int valor) {
		System.out.println("O maior número inteiro é: " + valor);
	}
	
}

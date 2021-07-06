import java.util.Locale;
import java.util.Scanner;

public class ExercíciosFor {

	public static void main(String[]args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*//Ex1
		System.out.println("Qual o valor máximo? (<= 1000): ");
		int x = sc.nextInt();
		if(x>1000) {
			System.out.println("Por favor, digite um número válido: ");
			x = sc.nextInt();
		}
		int y = x;
		for(int i=0; i<=x; i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
		*/
		
		/*//Ex2
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			if(i<10 || i>20) {
				System.out.println(i + " out ");
			}else System.out.println(i + " in ");
		}
		*/
		
		/*//Ex3
		int n;
		System.out.println("Quantas médias você quer calcular? ");
		n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			System.out.println("Digite os 3 primeiros valores: ");
			double a, b, c;
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			System.out.printf("O valor da média ponderada é: %.1f %n", ((2*a+3*b+5*c)/10));
		}
		*/
		
		/*//Ex4
		System.out.println("Quantos pares quer dividir? ");
		int div = sc.nextInt();
		for(int i=0; i<div; i++) {
			int a, b;
			a = sc.nextInt();
			b = sc.nextInt();
			if(b==0) {
				System.out.println("Divisão impossível!");
			}
			else {
				System.out.println((double)a/b);
			}
		}
		*/
		
		/*//Ex5
		int fat = sc.nextInt();
		int result = 1;
		for(int i = 0; i<fat; i++) {
			result *= (fat-i);
		}
		System.out.println(result);
		*/
		
		/*//Ex6
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i == 0) {
				System.out.println(i);
			}
		}
		*/
		
		/*//Ex7
		int n = sc.nextInt();
		for(int i = 0; i<=n ; i++) {
			int quad = i*i;
			int cub = (int) Math.pow(i, 3);
			System.out.printf("%d %d %d %n", i, quad, cub);
		} 
		*/
		
		sc.close();
		
	}
}

import java.util.Locale;
import java.util.Scanner;
import entities.Triangulo;

public class Problema {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com as medidas do triângulo X: ");
		
		//Classe: é a definição do tipo
		//Objeto: são instâncias da classe
		
		Triangulo A = new Triangulo();
		A.a = sc.nextDouble();
		A.b = sc.nextDouble();
		A.c = sc.nextDouble();
		
		A.area();
		A.imprimir();
		
		Triangulo B = new Triangulo();
		B.a = sc.nextDouble();
		B.b = sc.nextDouble();
		B.c = sc.nextDouble();
		
		B.imprimir();
		
		A.imprimirMaior(A, B);
		
		/*//Solução sem POO
		System.out.println("Entre com as medidas do triângulo X: ");
		double ax, bx, cx;
		ax = sc.nextDouble();
		bx = sc.nextDouble();
		cx = sc.nextDouble();
		double px = (ax+bx+cx)/2;
		double areaX = Math.sqrt((px*(px - ax)*(px - bx)*(px - cx)));
		
		System.out.println("Entre com as medidas do triângulo Y: ");
		double ay, by, cy;
		ay = sc.nextDouble();
		by = sc.nextDouble();
		cy = sc.nextDouble();
		double py = ((ay+by+cy)/2);
		double areaY = Math.sqrt((py*(py - ay)*(py - by)*(py - cy)));
		
		System.out.println("O triângulo X tem área = " + areaX);
		System.out.println("O triângulo Y tem área = " + areaY);
		
		if(areaX > areaY) {
			System.out.println("A maior área é de: X");
		}
		else if(areaX < areaY) {
			System.out.println("A maior área é de: Y");
		}
		else System.out.println("As áreas são iguais!");
		*/
		
		sc.close();
	}

}

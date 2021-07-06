package entities;

public class Triangulo {
	
	public double a;
	public double b;
	public double c;
	
	public double area() {
		double p = (a+b+c)/2;
		return Math.sqrt((p*(p - a)*(p - b)*(p - c)));
	}
	
	public void imprimir() {
		System.out.println("O valor da área é: " + area());
	}
	
	public void imprimirMaior(Triangulo X, Triangulo Y) {
		if(X.area()>Y.area()) {
			System.out.println("O triângulo com maior área é X! ");
		} 
		else if(X.area()<Y.area()) { System.out.println("O triângulo com maior área é Y!");
		}
		else System.out.println("Os triângulos tem áreas iguais!");
	}

}

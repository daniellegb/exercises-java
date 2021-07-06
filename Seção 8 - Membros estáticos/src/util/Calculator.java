package util;

public class Calculator {

	//Esta classe é apenas utilitária, os valores para um determinado valor dado, será sempre igual nestas funções. Logo, elas não precisam ser implementadas como instâncias, mas como funções estáticas.
	
	public static final double PI = 3.14159;
	
	public static double circunference(double radius) {
		return 2 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3;
	}
}

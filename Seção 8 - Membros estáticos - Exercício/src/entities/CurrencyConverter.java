package entities;

public class CurrencyConverter {
	
	public static final double IOF = 1.06;
	
	public static double convert(double priceDolar, double howManyDolars) {
		return priceDolar * howManyDolars * IOF;
	}
	
}

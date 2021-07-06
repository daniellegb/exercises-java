package entities;

public class Account {
	
	private int number;
	private String name;
	private double value;
	
	public Account(int number, String name, double value) {
		this.name = name;
		this.number = number;
		deposit(value);
	}
	
	public Account(int number, String name) {
		this.name = name;
		this.number = number;
	}
	
	
	public int getNumber() {
		return this.number;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getValue() {
		return this.value;
	}
	
	public void deposit(double value) {
		this.value += value;
	}
	
	public void withdraw(double value) {
		this.value -= (value + 5);
	}
	
	public String toString() {
		return "Account "
				+ this.number
				+ ", Holder: "
				+ this.name
				+ ", Balance: "
				+ this.value;
	}
}

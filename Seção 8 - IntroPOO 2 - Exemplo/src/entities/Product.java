package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		double total = price * quantity;
		return total;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	//sobreposição:
	public String toString() {
		return "Product data: " + this.name + ", $" + String.format("%.2f", price) + ", " + this.quantity + " units, Total: " + String.format("%.2f", totalValueInStock());
	}

}

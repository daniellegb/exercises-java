package entities;

public class OrderItem {
	
	private int quantity;
	private double price;
	
	private Product product;
	
	public OrderItem() {
	}

	public OrderItem(int quantity, double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		product.setPrice(price);
	}
	
	
	
	
	public Product getProduct() {
		return product;
	}

	public double subTotal() {
		return this.quantity*product.getPrice();
	}

}

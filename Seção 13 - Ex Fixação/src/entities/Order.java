package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	
	private List <OrderItem> item = new ArrayList<>();
	private Client client;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public void addItem(OrderItem item) {
		this.item.add(item);
	}
	
	public void removeItem(OrderItem item) {
		this.item.remove(item);
	}
	
	public double total() {
		double sum = 0;
		for(OrderItem obj : item) {
			sum += obj.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName() + "(" + client.getBirthDate() + ") - " + client.getEmail() + "\n");
		sb.append("Ordered items: ");
		for(OrderItem obj : item) {
			sb.append(obj.getProduct().getName() + ", " + obj.getPrice() + ", Quantity:" + obj.getQuantity() + ", Subtotal: $" + obj.subTotal() + "\n");
		}
		sb.append("Total: " + total());
		return sb.toString();
	}

}

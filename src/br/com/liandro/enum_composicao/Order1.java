package br.com.liandro.enum_composicao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order1 {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private OrderStatus1 status;
	
	private Client client;
	private List<OrderItem> item = new ArrayList<>();

	public Order1(Date moment, OrderStatus1 status, Client client) {
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

	public OrderStatus1 getStatus() {
		return status;
	}

	public void setStatus(OrderStatus1 status) {
		this.status = status;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItem() {
		return item;
	}

	public void addItem(OrderItem orderItem) {
		item.add(orderItem);
	}

	public void removeItem(OrderItem orderItem) {
		item.remove(orderItem);
	}

	public double total() {
		double sum = 0.0;
		for (OrderItem oi : item) {
			sum += oi.subTotal();
		}
		return sum;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client + "\n");
		sb.append("Order items: \n");
		for (OrderItem oi : item) {
			sb.append(oi + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}

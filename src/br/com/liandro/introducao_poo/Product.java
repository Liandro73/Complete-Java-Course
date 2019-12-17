package br.com.liandro.introducao_poo;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return (price * quantity);
	}
	
	public void addProducts() {
		quantity += quantity;
	}
	
	public void removeProducts() {
		quantity -= quantity;
	}

}

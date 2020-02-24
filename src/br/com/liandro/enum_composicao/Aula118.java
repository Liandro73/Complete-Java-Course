package br.com.liandro.enum_composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Aula118 {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client clientOrder = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus1 status = OrderStatus1.valueOf(sc.next());
		
		Order1 order1 = new Order1(new Date(), status, clientOrder);
		
		System.out.print("How many items to this order? ");
		int items = sc.nextInt();
		
		for (int i = 1; i <= items; i++) {
			System.out.println("Enter #" + i + " item data");
			System.out.print("Product name: ");
			sc.nextLine();
			String nameProduct = sc.nextLine();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			
			Product product = new Product(nameProduct, price);
			
			OrderItem orderItem = new OrderItem(quantity, price, product);
			
			order1.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println(order1);
		
		sc.close();
		
	}
	
}
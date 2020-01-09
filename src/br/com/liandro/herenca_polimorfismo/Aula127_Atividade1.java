package br.com.liandro.herenca_polimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Aula127_Atividade1 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> products = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			Character typeProduct = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			if (typeProduct.equals('c')) {
				Product prod = new Product(name, price);
				products.add(prod);
			} else if (typeProduct.equals('i')) {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				Product prodImp = new ImportedProduct(name, price, customsFee);
				products.add(prodImp);
			} else if (typeProduct.equals('u')) {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				Product prodUsed = new UsedProdect(name, price, manufactureDate);
				products.add(prodUsed);
			}

		}

		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product totalProd : products) {
			System.out.println(totalProd.priceTag());
		}

		sc.close();

	}

}

package br.com.liandro.arrays_lists;

import java.util.Locale;
import java.util.Scanner;

public class Aula88 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product4[] vect = new Product4[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product4(name, price);
		}
		
		double sun = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sun += vect[i].getPrice();
		}
		
		double avg = sun / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();
	}

}

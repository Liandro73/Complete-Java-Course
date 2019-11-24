package br.com.liandro.introducao;

import java.util.Locale;

public class Aula16 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		System.out.println("Olá Mundo!");
		System.out.println("Bom dia!");

		int y = 32;
		double x = 10.3854;
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);

	}

}

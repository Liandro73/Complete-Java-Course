package br.com.liandro.introducao_poo;

import java.util.Locale;
import java.util.Scanner;

public class Aula71_Atividade1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.dolarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		CurrencyConverter.dolarBought = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.converter());
		
		sc.close();
	}

}

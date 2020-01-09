package br.com.liandro.herenca_polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Aula130_Atividade1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> payers = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			Character typePayer = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			if (typePayer == 'i') {
				System.out.print("Health expenditures: ");
				Double expHealth = sc.nextDouble();
				payers.add(new Individual(name, anualIncome, expHealth));
			}
			else if (typePayer == 'c') {
				System.out.print("Number of employees: ");
				Integer numbEmployees = sc.nextInt();
				payers.add(new Company(name, anualIncome, numbEmployees));
			}
			else {
				System.out.println("Invalided!");
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer payer : payers) {
			System.out.println(payer.getName() + ": $ " + String.format("%.2f", payer.tax()));
		}
		
		System.out.println();
		Double totalPaid = 0.0;
		for (TaxPayer payer : payers) {
			totalPaid += payer.tax();
		}
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalPaid));
		
		sc.close();
	}

}

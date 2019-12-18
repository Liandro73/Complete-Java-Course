package br.com.liandro.introducao_poo;

import java.util.Locale;
import java.util.Scanner;

public class Aula68_Atividade2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee.toString());
		System.out.print("Witch percentage to increase salary? ");		
		Double porcentage = sc.nextDouble();
		employee.increaseSalary(porcentage);
		
		System.out.println();
		System.out.println("Updated data: " + employee.toString());
		
		sc.close();
		
	}

}
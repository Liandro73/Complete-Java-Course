package br.com.liandro.herenca_polimorfismo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner; 
import java.util.List;

public class Aula126 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> employees = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			Character yesOrNo = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name:");
			String name = sc.nextLine();
			System.out.print("Hours:");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour:");
			Double valuePerHour = sc.nextDouble();
			
			if (yesOrNo.equals('y')) {
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				Employee oEmployee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employees.add(oEmployee);
			} else {
				Employee employee = new Employee(name, hours, valuePerHour);
				employees.add(employee);
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee employee : employees) {
			System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
		}
		
		sc.close();

	}

}

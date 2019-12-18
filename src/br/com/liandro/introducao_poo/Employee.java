package br.com.liandro.introducao_poo;

public class Employee {
	
	protected String name;
	protected Double grossSalary;
	protected Double tax;
	
	protected Double netSalary() {
		return grossSalary - tax;
	}
	
	protected void increaseSalary(double porcentage) {
		grossSalary += grossSalary * porcentage / 100.0;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f%n", netSalary());
	}
}

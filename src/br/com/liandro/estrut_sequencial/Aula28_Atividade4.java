package br.com.liandro.estrut_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Aula28_Atividade4 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numFuncionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorHoraTrab = sc.nextDouble();
		double salario = horasTrabalhadas * valorHoraTrab;
		
		System.out.println("NUMBER = " + numFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		sc.close();
	}
	
}

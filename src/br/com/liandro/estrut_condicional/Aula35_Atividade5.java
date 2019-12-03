package br.com.liandro.estrut_condicional;

import java.util.Locale;
import java.util.Scanner;


public class Aula35_Atividade5 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double codigo = sc.nextInt();
		double quantidade = sc.nextInt();
		
		double cachorroQuente[] = {1,4.00};
		double xSalada[] = {2,4.50};
		double xBacon[] = {3,5.00};
		double torradaSimples[] = {4,2.00};
		double refrigerante[] = {5,1.50};
		
		if (codigo == 1) {
			System.out.printf("Total: R$ %.2f%n", cachorroQuente[1] * quantidade);
		} else if (codigo == 2) {
			System.out.printf("Total: R$ %.2f%n", xSalada[1] * quantidade);
		} else if (codigo == 3) {
			System.out.printf("Total: R$ %.2f%n", xBacon[1] * quantidade);
		} else if (codigo == 4) {
			System.out.printf("Total: R$ %.2f%n", torradaSimples[1] * quantidade);
		} else {
			System.out.printf("Total: R$ %.2f%n", refrigerante[1] * quantidade);
		}
		
		sc.close();
	}
}

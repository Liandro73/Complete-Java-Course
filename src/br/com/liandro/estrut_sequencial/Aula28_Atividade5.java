package br.com.liandro.estrut_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Aula28_Atividade5 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double peca1[] = {sc.nextDouble(),sc.nextDouble(),sc.nextDouble()};
		double peca2[] = {sc.nextDouble(),sc.nextDouble(),sc.nextDouble()};
		
		double valorPeca1 = peca1[1] * peca1[2];
		double valorPeca2 = peca2[1] * peca2[2];
		double valorTotal = valorPeca1 + valorPeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
		sc.close();
	}
	
}

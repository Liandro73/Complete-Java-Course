package br.com.liandro.estrut_sequencial;

import java.util.Scanner;

public class Aula28_Atividade1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		int resultado = valor1 + valor2;
		
		System.out.println("SOMA = " + resultado);
		sc.close();
	}

}

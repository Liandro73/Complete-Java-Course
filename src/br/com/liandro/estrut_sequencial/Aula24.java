package br.com.liandro.estrut_sequencial;

import java.util.Scanner;

public class Aula24 {

	public static void main(String[] args) {

		System.out.println("Digite um valor entre 0 e 100:");

		int numero;
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();

		// sc.next(); para String
		// sc.nextInt(); para Int
		// sc.nextDouble(); para Double
		// sc.next().charAt(0);

		sc.close();

		if (numero > 100 || numero < 0) {
			System.out.println("Você digitou um valor inválido!");
		} else
			System.out.println("Você digitou: " + numero);

	}

}

package br.com.liandro.estrut_condicional;

import java.util.Scanner;

public class Aula38 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
		sc.close();
	}

}

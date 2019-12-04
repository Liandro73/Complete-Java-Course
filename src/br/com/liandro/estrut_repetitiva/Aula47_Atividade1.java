package br.com.liandro.estrut_repetitiva;

import java.util.Scanner;

public class Aula47_Atividade1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long senha = sc.nextLong();
		
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}

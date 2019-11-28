package br.com.liandro.estrut_sequencial;

import java.util.Scanner;

public class Aula28_Atividade3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int resultado = (a * b - c * d);
		
		System.out.println("DIFERENÇA = " + resultado);
		
		sc.close();
	}

}

package br.com.liandro.estrut_repetitiva;

import java.util.Scanner;

public class Aula47_Atividade2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while ( x != 0 && y != 0) {
			
			if (x > 0.0 && y > 0.0) {
				System.out.println("primeiro");
			}
			else if (x < 0.0 && y > 0.0) {
				System.out.println("segundo");
			}
			else if (x < 0.0 && y < 0.0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
				x = sc.nextInt();
				y = sc.nextInt();
		}
		
		sc.close();
	}

}

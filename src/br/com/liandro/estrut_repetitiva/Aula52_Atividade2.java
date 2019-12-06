package br.com.liandro.estrut_repetitiva;

import java.util.Scanner;

public class Aula52_Atividade2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int in = 0;
		int out = 0;

		for (int i = 0; i < N; i++) {
			
			int num = sc.nextInt();
			
			if (num >= 10 && num <= 20) {
				in += 1;
			} else {
				out += 1;
			}
			
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();

	}

}

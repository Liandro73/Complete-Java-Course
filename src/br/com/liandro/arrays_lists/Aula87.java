package br.com.liandro.arrays_lists;

import java.util.Locale;
import java.util.Scanner;

public class Aula87 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		System.out.printf("AVERAGE HEIGHT = %.2f%n",(vect[0] + vect[1] + vect[2]) / n);

		sc.close();
	}
}

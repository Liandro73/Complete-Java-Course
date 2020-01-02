package br.com.liandro.arrays_lists;

import java.util.Scanner;

public class Aula96 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Main diagonal:");
		for (int k = 0; k < mat.length; k++) {
			System.out.print(mat[k][k] + " ");
		}
		System.out.println();
		
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
				count++;
				}
			}
		}
		System.out.println("Negative numbers = " + count);

		sc.close();
	}

}

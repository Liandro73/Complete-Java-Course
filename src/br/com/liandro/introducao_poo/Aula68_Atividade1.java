package br.com.liandro.introducao_poo;

import java.util.Locale;
import java.util.Scanner;

public class Aula68_Atividade1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height:");
		
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rectangle.calcArea());
		System.out.printf("PERIMETER = %.2f%n", rectangle.calcPerimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.calcDiagonal());
		
		sc.close();
		
	}

}

package br.com.liandro.estrut_sequencial;

import java.util.Scanner;

public class Aula28_Atividade {

	public static void main(String[] args) {
		
		double largura, comprimento, area, preco;
		Scanner sc = new Scanner(System.in);
		
		largura = sc.nextDouble();
		comprimento = sc.nextDouble();
		preco = sc.nextDouble();
		area = largura * comprimento;
		
		System.out.printf("A área total do terreno é de: %.2f metros quadrados %n", area);
		System.out.println("O preço total do terreno é de " + preco * area);
		sc.close();
	}
}

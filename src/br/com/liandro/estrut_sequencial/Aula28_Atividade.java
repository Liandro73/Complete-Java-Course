package br.com.liandro.estrut_sequencial;

import java.util.Scanner;

public class Aula28_Atividade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double preco = sc.nextDouble();
		double area = largura * comprimento;
		double valorTotal = preco * area;
		
		System.out.printf("A área total do terreno é de: %.2f metros quadrados %n", area);
		System.out.printf("O preço total do terreno é de %.2f reais %n", valorTotal);
		sc.close();
	}
}

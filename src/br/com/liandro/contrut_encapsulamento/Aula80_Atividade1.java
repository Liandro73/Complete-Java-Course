package br.com.liandro.contrut_encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Aula80_Atividade1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Conta conta = new Conta();
		Cliente cliente = new Cliente();

		Double saldo = 0.00;

		conta.setSaldo(saldo);

		System.out.print("Enter account number: ");
		conta.numeroConta = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String titular = sc.nextLine();
		cliente.setTitular(titular);
		
		Character simNao;
		System.out.print("Is there na initial deposit (y/n)? ");
		simNao = sc.next().charAt(0);

		switch (simNao) {
		case 'y':
			System.out.print("Enter initial deposit value: ");
			Double depInicial = sc.nextDouble();
			conta.setDepInicial(depInicial);
			conta.fazerDepositoIncial();
			System.out.println("");
			break;
		case 'n':
			System.out.println("");
			break;
		default:
			System.out.println("\n" + "Invalid character, type 'y' for YES or 'n' for NO");
			break;
		}

		System.out.println("Account data:");
		System.out.println("Accont " + conta.numeroConta + ", Holder: " + cliente.getTitular() + conta);
		System.out.println("");

		System.out.print("Enter a deposit value: ");
		Double deposito = sc.nextDouble();
		conta.fazerDeposito(deposito);
		System.out.println("Updated account data:");
		System.out.println("Accont " + conta.numeroConta + ", Holder: " + cliente.getTitular() + conta);
		System.out.println("");

		System.out.print("Enter a withdraw value: ");
		Double saque = sc.nextDouble();
		conta.fazerSaqueComTarifa(saque);
		System.out.println("Updated account data:");
		System.out.println("Accont " + conta.numeroConta + ", Holder: " + cliente.getTitular() + conta);

		sc.close();
	}

}

package br.com.liandro.excecoes;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();

			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();

			Account ac = new Account(number, holder, balance, withdrawLimit);

			ac.withdraw(amount);
			System.out.println("New balance: " + String.format("%.2f", ac.getBalance()));

		} catch (NegocioException ne) {
			System.out.println("Withdraw error: " + ne.getMessage());
		} catch (Exception ne) {
			System.out.println("Withdraw error: " + ne.getMessage());
		}

		sc.close();
	}

}

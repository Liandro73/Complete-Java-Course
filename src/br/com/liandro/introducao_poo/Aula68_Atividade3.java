package br.com.liandro.introducao_poo;

import java.util.Locale;
import java.util.Scanner;

public class Aula68_Atividade3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student st = new Student();
		st.name = sc.nextLine();
		st.exam1 = sc.nextDouble();
		st.exam2 = sc.nextDouble();
		st.exam3 = sc.nextDouble();

		System.out.printf("FINAL GRADE = %.2f%n", st.finalGrade());

		if (st.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", st.missingPoints());
		} else {
			System.out.println("PASS");
		}

		sc.close();
	}

}

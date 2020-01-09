package br.com.liandro.herenca_polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Aula129 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the of shapes: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			Character type = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			sc.nextLine();
			Color color = Color.valueOf(sc.next());
			if (type == 'r') {
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				System.out.print("Height: ");
				Double height = sc.nextDouble(); 
				list.add(new Rectangle(color, width, height));
			}
			else if (type == 'c') {
				System.out.print("Radius: ");
				Double radius = sc.nextDouble(); 
				list.add(new Circle(color, radius));
			}
			else {
				System.out.println("Invalited!");
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape st : list) {
			System.out.println(String.format("%.2f", st.area()));
		}
		
		sc.close();

	}

}

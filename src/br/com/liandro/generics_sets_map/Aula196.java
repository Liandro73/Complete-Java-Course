package br.com.liandro.generics_sets_map;

import java.util.Scanner;

public class Aula196 {

    public static void main(String[] args) throws IllegalAccessException {

        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        System.out.println("First: " + ps.first());

        sc.close();

    }
}

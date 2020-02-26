package br.com.liandro.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aula215 {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        List<String> name = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        name.forEach(System.out::println);
    }
}

package br.com.liandro.generics_sets_map;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Aula203 {

    public static void main(String[] args) {

        Set<ProductTreeSet> set = new TreeSet<>();

        set.add(new ProductTreeSet("TV", 900.0));
        set.add(new ProductTreeSet("Notebook", 1200.0));
        set.add(new ProductTreeSet("Tablet", 400.0));

        for (ProductTreeSet p : set){
            System.out.println(p);
        }

    }
}

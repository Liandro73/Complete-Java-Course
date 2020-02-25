package br.com.liandro.generics_sets_map;

import java.util.HashSet;
import java.util.Set;

public class Aula201 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
//        Set<String> set = new TreeSet<>();
//        Set<String> set = new LinkedHashSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        set.removeIf(x -> x.charAt(0) == 'T');

        for (String p : set){
            System.out.println(p);
        }
    }
}

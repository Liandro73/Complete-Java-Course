package br.com.liandro.arrays_lists;

public class Aula90 {

	public static void main(String[] args) {
		
		int x = 20;
		
		Object obj = x;
		//O Object pode ser substituído pelas Wrapper Classes
		
		System.out.println(obj);
		
		int y = (int) obj;
		
		System.out.println(y);
	}
}

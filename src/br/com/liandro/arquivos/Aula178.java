package br.com.liandro.arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aula178 {
	
	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good mornig", "Good afternoon", "Good nigth"};
		
		String path = "/tmp/out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){		
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

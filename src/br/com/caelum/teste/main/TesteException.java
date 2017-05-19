package br.com.caelum.teste.main;

import java.io.FileNotFoundException;

public class TesteException {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

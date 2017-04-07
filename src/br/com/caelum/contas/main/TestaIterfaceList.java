package br.com.caelum.contas.main;

import java.util.HashSet;
import java.util.Set;

public class TestaIterfaceList {

	public static void main(String[] args) {

		Set<String> c = new HashSet<>();
		
		c.add("Spider Man");
		c.add("João");
		c.add("Maria");
		
		for (String nome : c) {
			System.out.println(nome);
		}
	}

}

package br.com.caelum.contas.main;

import java.util.HashSet;
import java.util.Set;

public class TestaInterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> conjunto = new HashSet<>();
		
		conjunto.add("java");
		conjunto.add("vraptor");
		conjunto.add("scala");
		
		for (String palavra : conjunto) {
			System.out.println(palavra);
		}
	}

}

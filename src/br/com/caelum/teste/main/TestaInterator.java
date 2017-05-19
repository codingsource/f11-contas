package br.com.caelum.teste.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class TestaInterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> conjunto = new HashSet<>();
		
//		conjunto.add("java");
//		conjunto.add("vraptor");
//		conjunto.add("scala");
		
//		for (String palavra : conjunto) {
//			System.out.println(palavra);
//		}
		
		conjunto.add("item 1");
		conjunto.add("item 2");
		conjunto.add("item 3");
		
		// Retorna o iterator
		Iterator<String> i = conjunto.iterator();
		
		while (i.hasNext()) {
			String palavra = i.next();
			System.out.println(palavra);
		}
	}

}
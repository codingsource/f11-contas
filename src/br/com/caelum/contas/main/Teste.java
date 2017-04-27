package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Teste {
	public static void main(String[] args) {
		// String nome;
		// Scanner s = new Scanner(System.in);
		// System.out.println("Digite seu nome: ");
		// nome = s.next();
			
		
		List<String> lista = new ArrayList<>();
		lista.add("Sérgio");
		lista.add("Paulo");
		lista.add("Guilherme");
		
//		ComparadorPorTamanho comparador = new ComparadorPorTamanho();
//		Collections.sort(lista, comparador);
//		
//		Collections.sort(lista, new ComparadorPorTamanho());
		
//		Comparator<String> comparador = new Comparator<String>() {
//			public int compare(String s1, String s2) {
//				return Integer.compare(s1.length(), s2.length());
//			}
//		};
//		
//		Collections.sort(lista, comparador);
		
//		Collections.sort(lista, new Comparator<String>() {
//			public int compare(String s1, String s2) {
//				return Integer.compare(s1.length(), s2.length());
//			}
//		});

		Collections.sort(lista, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		System.out.println(lista);
	}
}

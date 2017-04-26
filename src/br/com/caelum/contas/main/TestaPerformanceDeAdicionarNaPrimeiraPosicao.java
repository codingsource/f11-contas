package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Iniciando...");
		long inicio = System.currentTimeMillis();
		
		List<Integer> teste = new LinkedList<>();
//		List<Integer> teste = new ArrayList<>();
		
		for (int i = 0; i < 30000; i++) {
			teste.add(0, i);
		}
		
//		for (Integer integer : teste) {
//			integer.intValue();
//		}
		
		Iterator<Integer> i = teste.iterator();
		
		while (i.hasNext()) {
			i.next();
		}
		
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("Tempo gasto: " + tempo);
	}

}

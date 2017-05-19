package br.com.caelum.teste.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TesteTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> number = new TreeSet<>();
		
		List<Integer> num = new ArrayList<>();
		
		for (int i = 1; i <= 10; i++) {
			number.add(i);
			num.add(i);
		}
		
		System.out.println(number.descendingSet().toString());
		System.out.println(num.toString());
		
		Iterator<Integer> x = num.iterator();
		
		while (x.hasNext()) {
			x.next().toString();
		}
	}

}

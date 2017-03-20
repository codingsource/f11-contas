package br.com.caelum.banco;

public class ManipuladorDeTributos {
	
	private double total;
	
	public void calculaImposto () {
		total = 0;
		int tamanho = 1;
		for (int i = 0; i < tamanho; i++) {
//			Tributavel t = i;
//			total += t;
		}
	}
	
	public double getTotal() {
		return total;
	}
}

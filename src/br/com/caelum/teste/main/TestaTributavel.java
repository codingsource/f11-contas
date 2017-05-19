package br.com.caelum.teste.main;

import br.com.caelum.banco.ContaCorrente;
import br.com.caelum.banco.Tributavel;

public class TestaTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.getValorImposto());
		
		Tributavel t = cc;
		System.out.println(t.getValorImposto());
	}

}

package br.com.caelum.contas.main;

import br.com.caelum.banco.Conta;
import br.com.caelum.banco.ContaCorrente;
import br.com.caelum.banco.SaldoInsuficienteException;

public class TesteSaldoException {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.getSaldo());
		
		try {
			cc.saque(-100);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
	}

}

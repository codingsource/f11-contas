package br.com.caelum.banco;

import java.util.Collections;
import java.util.List;

public class ManipuladorDeContas {
	
	private Conta conta;
	
	public void criaConta(Cliente c, double saldo, String tipo) {
		this.conta = new Conta(c, saldo, tipo);
//		this.conta.titular = c;
//		this.conta.saldo = saldo;
//		this.conta.tipo = tipo;
//		
	}
	
	public void ordenaLista(List<Conta> contas) {
		Collections.sort(contas);
	}
	
	public void saque(double valor) {
		this.conta.saque(valor);
	}
	
	public void mostra() {
		this.conta.getConta();
	}
}

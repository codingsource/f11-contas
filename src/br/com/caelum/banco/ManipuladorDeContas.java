package br.com.caelum.banco;

public class ManipuladorDeContas {
	
	private Conta conta;
	
	public void criaConta(Cliente c, double saldo, String tipo) {
//		this.conta = new Conta(c, saldo, tipo);
	}
	
	public void saque(double valor) {
		this.conta.saque(valor);
	}
	
	public void mostra() {
		this.conta.getConta();
	}
}

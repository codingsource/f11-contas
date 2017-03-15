package br.com.caelum.banco;

public class ContaCorrente extends Conta {
	
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
	
	@Override
	public void deposita(double quantidade) {
		this.saldo += quantidade - 0.10;
	}
}

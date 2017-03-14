package br.com.caelum.banco;

public class ContaPoupanca extends Conta {

	@Override
	public void atualiza(double taxa) {
//		this.saldo += this.saldo * taxa * 3;
		super.atualiza(taxa);
	}
	
	@Override
	public void deposita(double quantidade) {
		super.deposita(quantidade);
	}
}

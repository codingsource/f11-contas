package br.com.caelum.banco;

public class ContaCorrente extends Conta {

	@Override
	public void saque(double quantidade) {
		super.saque(quantidade);
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	@Override
	public void deposita(double quantidade) {
		this.saldo += quantidade - 0.10;
	}

	@Override
	public String getTipo() {
		return this.getTipo();
	}
	
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}
}

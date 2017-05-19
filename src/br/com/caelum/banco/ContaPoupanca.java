package br.com.caelum.banco;

public class ContaPoupanca extends Conta{

	@Override
	public void atualiza(double taxa) {
		synchronized (this) {
			this.saldo += this.saldo * taxa * 3;
		}
	}

	@Override
	public void deposita(double quantidade) {
		super.deposita(quantidade);
	}

	@Override
	public String getTipo() {
		return this.tipo;
	}

}

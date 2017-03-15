package br.com.caelum.banco;

public class ContaPoupanca extends Conta implements Tributavel {

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}
	
	@Override
	public void deposita(double quantidade) {
		super.deposita(quantidade);
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}
}

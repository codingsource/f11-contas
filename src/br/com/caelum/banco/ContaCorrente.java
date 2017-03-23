package br.com.caelum.banco;

public class ContaCorrente extends Conta {

	@Override
	public void saque(double quantidade) {
		if (quantidade < 0) {
			throw new IllegalArgumentException("Você tentou sacar" + " um valor negativo");
		}
		if (this.saldo < quantidade || quantidade > this.saldo + this.limite) {
			throw new SaldoInsuficienteException(quantidade);
		}
		this.saldo -= (quantidade + 0.10);
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

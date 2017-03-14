package br.com.caelum.banco;

/*
 * @author Peter
 * */

public class AtualizadorDeContas{
	
	private double saldoTotal = 0;
	private double selic;

	public double getSelic() {
		return selic;
	}
	
	public void setSelic(double selic) {
		this.selic = selic;
	}
	
	public double getSaldoTotal() {
		return this.saldoTotal;
	}
	
	public AtualizadorDeContas(double selic) {
		this.setSelic(selic);
	}
	
	public void roda(Conta c) {
		System.out.println("Saldo anterior: " + c.saldo);
		
		c.atualiza(this.selic);
		this.saldoTotal = c.getSaldo();
		
		System.out.println("Saldo Atual: " + this.saldoTotal);
	}

}

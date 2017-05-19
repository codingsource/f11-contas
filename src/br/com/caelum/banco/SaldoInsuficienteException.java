package br.com.caelum.banco;

public class SaldoInsuficienteException extends RuntimeException{

	/**
	 * 	Peter Thomas
	 */
	private static final long serialVersionUID = 9113269592322744427L;

	public SaldoInsuficienteException(double valor) {
		super("Saldo insuficiente para sacar o valor de: " + valor);
	}
	

}

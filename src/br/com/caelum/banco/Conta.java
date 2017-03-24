package br.com.caelum.banco;

import br.com.caelum.util.DataTime;

/**
 * Created by peter on 13/03/2017.
 *
 * @author PeterThomas
 */
public class Conta implements Comparable<Conta> {

	protected Banco banco;
	protected String agencia;
	protected int numero;
	protected double saldo;
	protected double limite;
	protected String dataAbertura;
	protected Cliente titular;
	protected String tipo;

	private static int totalDeContas;

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getTitular() {
		return this.titular.getNome();
	}

	public void setTitular(Cliente c) {
		this.titular = c;
	}

	public static int totalDeContas() {
		return Conta.totalDeContas;
	}

	public String getAgencia() {
		return agencia;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public Conta() {
	};

	public Conta(Cliente titular, double saldo, String tipo) {
		super();

		DataTime d = new DataTime();
		this.dataAbertura = d.dataAtual_();
		this.agencia = "2883";
		this.titular = titular;
		this.saldo = saldo;
		this.limite = 1000.0;
		this.tipo = tipo;

		Conta.totalDeContas = Conta.totalDeContas + 1;
		this.numero = Conta.totalDeContas();
	}

	public void saque(double quantidade) {
		if (quantidade < 0) {
			throw new IllegalArgumentException("Voc? tentou sacar" + " um valor negativo");
		}
		if (this.saldo < quantidade || quantidade > this.saldo + this.limite) {
			throw new SaldoInsuficienteException(quantidade);
		}
		this.saldo -= (quantidade + 0.10);
	}

	public void deposita(double quantidade) {
		if (quantidade < 0) {
			throw new IllegalArgumentException("Voc? tentou depositar" + " um valor negativo");
		} else {
			this.saldo += quantidade;
		}
	}

	boolean tranferePara(Conta destino, double valor) {
		if (valor > 0) {
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
	}

	public void getConta() {
		System.out.println("Data de abertura: " + this.dataAbertura);
		System.out.println("Ag?ncia: " + this.agencia);
		System.out.println("N?mero: " + this.numero);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Limite: " + this.limite);
		System.out.println("Saldo: " + this.saldo);
		this.titular.mostra();

	}

	@Override
	public String toString() {
		return "{ \n Titular = " + this.getTitular().toUpperCase() + "\n Numero = " + this.getNumero() + "\n Agencia = "
				+ this.getAgencia() + "\n Data de abertura = " + this.getDataAbertura() + "\n Tipo = " + this.getTipo()
				+ "\n Saldo = " + this.getSaldo() + "}";
	}

	@Override
	public boolean equals(Object object) {
		if (object == null) {
			return false;
		}

		// Casting de refer?ncias
		Conta outraConta = (Conta) object;

		return this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia);
	}

	public void atualiza(double taxa) {

	}

	@Override
	public int compareTo(Conta arg0) {
		return this.titular.getNome().compareTo(arg0.titular.getNome());
	}
}
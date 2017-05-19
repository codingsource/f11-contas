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
		synchronized (this) {
			if (quantidade < 0) {
				throw new IllegalArgumentException("Voc? tentou depositar" + " um valor negativo");
			} else {
				this.saldo += quantidade;
			}
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
		System.out.println("Agencia: " + this.agencia);
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

	public void atualiza(double taxa) {
		synchronized (this) {
			double saldoAtualizado = this.saldo * (1 + taxa);
			this.saldo =  saldoAtualizado;
		}

	}

	@Override
	public int compareTo(Conta arg0) {
		return this.titular.getNome().compareTo(arg0.titular.getNome());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
}
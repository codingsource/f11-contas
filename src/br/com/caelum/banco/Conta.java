package br.com.caelum.banco;

import br.com.caelum.util.DataTime;

/**
 * Created by peter on 13/03/2017.
 *
 * @author PeterThomas
 */
public class Conta {

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
		return this.saldo + this.limite;
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
		// this.banco.setNome("Banco do Brasil");
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

	void saque(double quantidade) {
		if (this.saldo < quantidade || quantidade > this.saldo + this.limite) {
				throw new IllegalArgumentException("Saldo insuficiente");
		} else {
			this.saldo -= quantidade;
		}
	}

	public void deposita(double quantidade) {
		if (quantidade % 2 == 0) {
			this.saldo += quantidade;
		}
	}

	// boolean tranferePara(Conta destino, double valor) {
	// if (!this.saque(valor)) {
	// return false;
	// } else {
	// destino.deposita(valor);
	// return true;
	// }
	// }

	public void getConta() {
		System.out.println("Data de abertura: " + this.dataAbertura);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Número: " + this.numero);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Limite: " + this.limite);
		System.out.println("Saldo: " + this.saldo);
		this.titular.mostra();

	}

	public void atualiza(double taxa) {

	}
}
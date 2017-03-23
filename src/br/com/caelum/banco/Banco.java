package br.com.caelum.banco;

/*
 * @author PeterThomas
 * 
 * */

public class Banco {

	private String nome;
	private int numero;
	private Conta[] contas;

	public Banco (String nome, int numero) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.contas =  new ContaCorrente[10];
	}
	
	public void adiciona(Conta c) {
		for (int i = 0; i < this.contas.length; i++) {
			if(this.contas[i] == null) {
				this.contas[i] = c;
			}
		}
	}
	
	public void mostraContas() {
		for (int i = 0; i < this.contas.length; i++) {
			System.out.println("Conta na posição: " + i);			
			this.contas[i].getConta();
		}
	}
		
}

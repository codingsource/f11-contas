package br.com.caelum.banco;

/*
 * @author PeterThomas
 * 
 * */

public class Banco {

	public String nome;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Banco (String nome) {
		super();
		this.nome = nome;
	}
		
}

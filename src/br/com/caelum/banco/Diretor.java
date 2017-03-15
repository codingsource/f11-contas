package br.com.caelum.banco;

public class Diretor extends Funcionario implements Autenticavel {

	protected int senha;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public Diretor(int senha) {
		this.senha = senha;
	}

	@Override
	double getBonificacao() {
		return this.salario * 1.5 + 1000;
	}

	public boolean autentica(int senha) {
		return this.senha == senha ? true : false;
	}

}

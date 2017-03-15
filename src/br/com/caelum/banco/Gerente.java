package br.com.caelum.banco;

/*
 * @author Peter Thomas
 * 
 * */

public class Gerente extends Funcionario implements Autenticavel {

	private int senha;
	private int numeroDeFuncionariosGerenciados;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	public Gerente() {
		super();
	}

	public Gerente(String nome, String cpf, double salario, int senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha != senha) {
			System.out.println("Acesso Negado!");
			return false;
		}
		
		System.out.println("Acesso Permitido!");
		return true;
	}

	@Override
	public double getBonificacao() {
		return this.salario * 1.4 + 1000;
	}
}

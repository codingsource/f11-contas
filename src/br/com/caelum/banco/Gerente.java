package br.com.caelum.banco;

/*
 * @author Peter Thomas
 * 
 * */

public class Gerente extends Funcionario {

	int senha;
	int numeroDeFuncionariosGerenciados;

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
	
	public Gerente () {
		super();
	}

	public Gerente(String nome, String cpf, double salario, int senha) {
		
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}
	
	@Override
	public double getBonificacao () {
		return this.salario * 1.4 + 1000; 
	}
}

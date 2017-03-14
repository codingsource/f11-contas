package br.com.caelum.banco;

import br.com.caelum.util.ValidaCpfCnpj;

abstract class Funcionario {
			
	protected String nome;
	protected String cpf;
	protected double salario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public Funcionario() {
		super();
	}

	public Funcionario(String nome, String cpf, double salrio) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salrio;
	}
	
	public void mudaCPF(String cpf) {
        validaCPF(cpf);
        this.cpf = cpf;
    }

    private void validaCPF(String cpf) {
        if (ValidaCpfCnpj.isValidCPF(cpf)) {
            System.out.println("Cpf informado e valido.");
        } else {
            System.out.println("Cpf informado e invalido.");
        }
    }
    
    public double getBonificacao() {
    	return this.salario * 1.2;
    }

	public void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Cpf: " + this.cpf);
		System.out.println("Salario: " + this.salario);
	}

}

package br.com.caelum.banco;

import br.com.caelum.util.ValidaCpfCnpj;

/**
 * Cliente
 * 
 * @author Peter
 */
public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    private int idade;

    public Cliente(String nome, String sobrenome, String cpf, int idade) {
        super();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() { return this.cpf;  }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void mudaCPF(String cpf) {
        if (this.idade <= 60) {
            validaCPF(cpf);
        }
        this.cpf = cpf;
    }

    private void validaCPF(String cpf) {
        if (ValidaCpfCnpj.isValidCPF(cpf)) {
            System.out.println("CPf informado é valido.");
        } else {
            System.out.println("Cpf informado é invalido.");
        }
    }

	public void mostra() {
		System.out.println("Nome: " + this.nome + this.sobrenome);
		System.out.println("Cpf: " + this.cpf + "\n");
		
	}
}
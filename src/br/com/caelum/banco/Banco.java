package br.com.caelum.banco;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * @author PeterThomas
 * 
 * */

public class Banco {

	private String nome;
	private int numero;
	private List<Conta> contas;

	public Banco(String nome, int numero) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.contas = new ArrayList<>();
	}

	public void adiciona(Conta c) {
		this.contas.add(c);
	}

	public void mostraContas() {
		Iterator<Conta> c = this.contas.iterator();
		Conta conta;
		while (c.hasNext()) {
			conta = c.next();
			conta.getConta();
		}
	}

	public Conta pega(int x) throws RuntimeException {
		Iterator<Conta> c = this.contas.iterator();
		while (c.hasNext()) {
			Conta conta = c.next();
			if (x == c.next().getNumero()) {
				return conta;
			}
		}
		return null;
	}

	public int pegaQuantidadeDeContas() {
		return this.contas.size();
	}
}

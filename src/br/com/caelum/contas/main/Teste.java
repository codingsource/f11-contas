package br.com.caelum.contas.main;

import java.util.Scanner;

import br.com.caelum.util.DataTime;

public class Teste {
	public static void main(String[] args) {
		// String nome, sobrenome, idade, profissao;
		//
		// Scanner s = new Scanner(System.in);
		//
		// System.out.println("Digite seu nome: ");
		// nome = s.next();
		// System.out.println("Sobrenome: ");
		// sobrenome = s.next();
		// System.out.println("Idade: ");
		// idade = s.next();
		// System.out.println("Profissão: ");
		// profissao = s.next();
		//
		//
		// System.out.println("Meu nome: " + nome + "\n Sobrenome: " + sobrenome
		// + "\n Idade: " + idade + "\n Profissão: " + profissao);

		DataTime data = new DataTime();
		System.out.println(data.simpleDate());
		System.out.println(data.simpleDateTime());
		System.out.println(data.simpleTime());
		System.out.println(data.simpleTimeZ());
		System.out.println(data.simpleTimeE());
		System.out.println(data.dataAtual_());
	}
}

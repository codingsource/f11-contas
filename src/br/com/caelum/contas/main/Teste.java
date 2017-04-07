package br.com.caelum.contas.main;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		String nome, sobrenome, idade, profissao;		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome =  s.next();
		System.out.println("Sobrenome: ");
		sobrenome = s.next();
		System.out.println("Idade: ");
		idade = s.next();
		System.out.println("Profissão: ");
		profissao = s.next();
		
		
		System.out.println("Meu nome: " + nome + "\n Sobrenome: " + sobrenome + "\n Idade: " + idade + "\n Profissão: " + profissao);
	}
}

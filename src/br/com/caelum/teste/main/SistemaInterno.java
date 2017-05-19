package br.com.caelum.teste.main;

import java.util.Scanner;

import br.com.caelum.banco.Autenticavel;

public class SistemaInterno {

	private Scanner sn;

	void login(Autenticavel a) {
		System.out.println("Digite a senha: ");
		sn = new Scanner(System.in);		
		int senha = sn.nextInt();
		
		boolean ok = a.autentica(senha);
	}

}

package br.com.caelum.banco;

import java.util.Scanner;

public class SistemaInterno {

	private Scanner sn;

	void login(Autenticavel a) {
		System.out.println("Digite a senha: ");
		sn = new Scanner(System.in);		
		int senha = sn.nextInt();
		
		boolean ok = a.autentica(senha);
	}

}

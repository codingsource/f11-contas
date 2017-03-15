package br.com.caelum.banco;

public class FuncionarioAutenticavel extends Funcionario {
	
	
	
	public boolean autentifica(int senha) {
		return false;
		
	}

	@Override
	double getBonificacao() {
		return 0;
	}

}

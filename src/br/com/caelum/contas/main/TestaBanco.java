package br.com.caelum.contas.main;

import br.com.caelum.banco.Banco;
import br.com.caelum.banco.Cliente;
import br.com.caelum.banco.ContaCorrente;

public class TestaBanco {
	public static void main(String[] args) {
		Banco banco = new Banco("Brasil" , 1);
		
		Cliente cl = new Cliente("Peter" , "Thomas", "077.444.222.55", 27);
		
		ContaCorrente cc = new ContaCorrente();
		cc.setTitular(cl);
		cc.setNumero(2);
		cc.setAgencia("13");
		cc.deposita(2600.0);
		banco.adiciona(cc);
		
		
//		cc.getConta();
		banco.mostraContas();
	}
}
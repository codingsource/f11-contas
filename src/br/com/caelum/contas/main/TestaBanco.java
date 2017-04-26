package br.com.caelum.contas.main;

import br.com.caelum.banco.Banco;
import br.com.caelum.banco.Cliente;
import br.com.caelum.banco.Conta;
import br.com.caelum.banco.ContaCorrente;
import br.com.caelum.banco.ContaPoupanca;
import br.com.caelum.util.DataTime;

public class TestaBanco {
	public static void main(String[] args) {
		Banco banco = new Banco("Brasil" , 1);
		
		Cliente cl = new Cliente("Peter" , "Thomas", "077.444.222.55", 27);
		
		DataTime dt = new DataTime();
		
		Conta cc = new ContaCorrente();
		cc.setDataAbertura(dt.simpleDate());
		cc.setTitular(cl);
		cc.setNumero(2);
		cc.setAgencia("13");
		cc.deposita(2600.0);
		banco.adiciona(cc);
		
		
		Conta cp = new ContaPoupanca();
		cp.setDataAbertura(dt.simpleDate());
		cp.setTitular(cl);
		cp.setNumero(121);
		cp.setAgencia("11");
		cp.deposita(3500.0);
		banco.adiciona(cp);
		
//		banco.mostraContas();
		System.out.println(banco.pegaQuantidadeDeContas());
	}
}
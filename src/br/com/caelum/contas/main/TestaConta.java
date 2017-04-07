package br.com.caelum.contas.main;

import java.util.LinkedList;
import java.util.List;

import br.com.caelum.banco.Cliente;
import br.com.caelum.banco.Conta;
import br.com.caelum.banco.ContaCorrente;
import br.com.caelum.banco.ContaPoupanca;
import br.com.caelum.banco.ManipuladorDeContas;
import br.com.caelum.banco.ManipulandorDeSeguroDeVida;

/**
 * Created by peter on 13/03/2017.
 */
public class TestaConta {
    public static void main (String args[]) {
    	
    	
    	Cliente cliente = new Cliente("Peter", " Thomas", "9.999.999", 27);
    	ManipuladorDeContas mc = new ManipuladorDeContas();
//		mc.criaConta(cliente, 3000, "Conta Corrente");
//    	mc.mostra();
    	
    	List<Conta> contas = new LinkedList<Conta>();
    	
    	for (int i = 1; i < 4; i++) {
    		
    		Conta cci = new ContaCorrente();
        	cci.setTitular(cliente);
        	cci.deposita(500.0 * i);
        	cci.setDataAbertura("24/03/2017");
        	cci.setTipo("Conta Corrente");
        	contas.add(cci);
        	
        	Conta cpi = new ContaPoupanca();
        	cpi.setTitular(cliente);
        	cpi.deposita(132.0 * i);
        	cpi.setDataAbertura("24/03/2017");
        	cpi.setTipo("Conta Poupança");
        	contas.add(cpi);
		}
    	
    	mc.ordenaLista(contas);	
    	
    	for (Conta conta : contas) {
    		conta.getConta();
		}
    	
    	System.out.println("\n");
    	
    	ManipulandorDeSeguroDeVida seguroDeVida = new ManipulandorDeSeguroDeVida(1, cliente.getNome(), 100.0);
    	seguroDeVida.getSeguro();
    }
}
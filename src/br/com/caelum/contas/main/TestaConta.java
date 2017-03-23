package br.com.caelum.contas.main;

import br.com.caelum.banco.Cliente;
import br.com.caelum.banco.ManipuladorDeContas;
import br.com.caelum.banco.ManipulandorDeSeguroDeVida;

/**
 * Created by peter on 13/03/2017.
 */
public class TestaConta {
    public static void main (String args[]) {
    	
    	Cliente cliente = new Cliente("Peter", "Thomas", "9.999.999", 27);
    	ManipuladorDeContas mc = new ManipuladorDeContas();
		mc.criaConta(cliente, 3000, "Conta Corrente");
    	mc.mostra();
    	
    	System.out.println("\n");
    	
    	ManipulandorDeSeguroDeVida seguroDeVida = new ManipulandorDeSeguroDeVida(1, cliente.getNome(), 100.0);
    	seguroDeVida.getSeguro();
    }
}
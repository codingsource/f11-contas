package br.com.caelum.contas.main;

import br.com.caelum.banco.AtualizadorDeContas;
import br.com.caelum.banco.Banco;
import br.com.caelum.banco.Cliente;
import br.com.caelum.banco.ContaCorrente;
import br.com.caelum.banco.ContaPoupanca;
import br.com.caelum.banco.Gerente;
import br.com.caelum.util.DataTime;

/**
 * Created by peter on 13/03/2017.
 */
public class TestaConta {
    public static void main (String args[]) {
    	
    	Cliente cliente = new Cliente("Peter", "Thomas", "9.999.999", 27);
    	
    	DataTime dt = new DataTime();
    	Banco b = new Banco("Banco do Brasil");
    	
        ContaCorrente cc = new ContaCorrente();
        cc.setBanco(b);
        cc.setAgencia("4421");
        cc.setNumero(1);
        cc.setDataAbertura(dt.dataAtual_());
        cc.setTitular(cliente);
        cc.setLimite(5000);
        cc.deposita(2700.0);
        cc.getConta();
        
        System.out.println("\n");
        
        ContaPoupanca cp = new ContaPoupanca();
        cp.setBanco(b);
        cp.setAgencia("1212");
        cp.setNumero(2);
        cp.setDataAbertura(dt.dataAtual_());
        cp.setTitular(cliente);
        cp.setLimite(5000);
        cp.deposita(2700.0);
        cp.getConta();
              
        Gerente gerente = new Gerente();
        gerente.setNome("Peter Thomas");
        gerente.setCpf("11.1110.445");
        gerente.setSenha(4321);
        
        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
        
        System.out.println("\n");
        
        adc.roda(cc);
        adc.roda(cp);
    }
}

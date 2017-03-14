package br.com.caelum.contas.main;

import br.com.caelum.banco.AtualizadorDeContas;
import br.com.caelum.banco.Banco;
import br.com.caelum.banco.Cliente;
import br.com.caelum.banco.Conta;
import br.com.caelum.banco.ContaCorrente;
import br.com.caelum.banco.ContaPoupanca;
//import br.com.caelum.banco.Funcionario;
import br.com.caelum.banco.Gerente;

/**
 * Created by peter on 13/03/2017.
 */
public class TestaConta {
    public static void main (String args[]) {
    	
    	Cliente cliente = new Cliente("Peter", "Thomas", "9.999.999", 27);
    	
    	Banco b = new Banco("Banco do Brasil");
    	System.out.println("Banco: " + b.getNome());
        Conta conta = new Conta(cliente, 0);
        conta.deposita(2700.0);
        conta.getConta();
        
        
        System.out.println("_________________\n");
        
        Gerente gerente = new Gerente();
        gerente.setNome("Peter Thomas");
        gerente.setSenha(4321);
        
//        Funcionario f = gerente;
//        f.setCpf("9.999.999");
//        f.setSalario(5000.0);
//        f.setSalario(f.getSalario() + f.getBonificacao());
//        f.mostra();
        
        System.out.println("\n");
        
//        Funcionario funcionario = new Funcionario("Petrick Eduardo", "8.888.877", 3000.0);
//        funcionario.setSalario(funcionario.getSalario() + funcionario.getBonificacao());
//        funcionario.mostra();
        
        
        System.out.println("\n");
        
        Conta c = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        
//        c.atualiza(0.01);
//        cc.atualiza(0.01);
//        cp.atualiza(0.01);
        
        System.out.println("Conta: " + c.getSaldo());
        System.out.println("Conta Corrente: " + cc.getSaldo());
        System.out.println("Conta Poupança: " + cp.getSaldo());
              
        
        System.out.println("\n");
                
        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
        
        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);
        
//        System.out.println("Saldo Total: " + adc.getSaldoTotal());
    }
}

package br.com.caelum.contas.main;

import java.util.HashMap;
import java.util.Map;

import br.com.caelum.banco.ContaCorrente;

public class TestaMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaCorrente c1 = new ContaCorrente();
		c1.deposita(10000);
		
		ContaCorrente c2 = new ContaCorrente();
		c2.deposita(3000);
		
		// cria o mapa
		Map<String, ContaCorrente> mapaDeContas = new HashMap<>();
		
		// adiciona duas chaves e seus respectivos valores
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);
		
		// qual a conta do diretor? (sem casting!)
		ContaCorrente contaDoDiretor = mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
	}

}

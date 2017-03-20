package br.com.caelum.banco;

public class ManipulandorDeSeguroDeVida {

	private  SeguroDeVida seguroDeVida;
		
	public ManipulandorDeSeguroDeVida(int numeroApolice, String titular, double valor) {
		super();
		this.seguroDeVida =  new SeguroDeVida(numeroApolice, titular, valor);
		this.seguroDeVida.setNumeroApolice(numeroApolice);
		this.seguroDeVida.setTitular(titular);
		this.seguroDeVida.setValor(valor);
	}
	
	public void getSeguro() {
		System.out.println("Seguro de Vida");
		System.out.println("Apolice: " + this.seguroDeVida.getNumeroApolice());
		System.out.println("Titular: " + this.seguroDeVida.getTitular());
		System.out.println("Valor: " + this.seguroDeVida.getValor());
	}

}

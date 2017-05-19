package br.com.caelum.teste.main;

public class Programa1 implements Runnable {
	public void run () {
		for (int i = 0; i < 100; i++) {
			System.out.println("programa 1 valor " + i);
		}
	}
}

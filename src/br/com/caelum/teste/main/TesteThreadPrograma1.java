package br.com.caelum.teste.main;

public class TesteThreadPrograma1 {

	public static void main(String[] args) {

		Runnable r = new Programa1();
		Thread t = new Thread(r);
		t.start();

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("R1 " + i);
				}
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		Runnable r2 = () -> {
			for (int i = 0; i < 100; i++) {
				System.out.println("Utilizando lambda R2 " + i);
			}
		};
		Thread t2 = new Thread(r2);
		t2.start();
	}

}

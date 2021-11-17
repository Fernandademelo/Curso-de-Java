package poo;

import java.util.Random;

public class Carro {
	int ano;
	String cor;
//	primeiro construtor
	public Carro() {
		Random gerador = new Random();
		int chassi = gerador.nextInt(1000);
		System.out.println("Chassi: " + chassi);
	}
	public Carro( int ano, String cor) {
		this.ano = ano;
		this.cor = cor;
	}
	
	void desligar() {
		System.out.println("Engine OFF");
	}
	void ligar() {
		System.out.println("Engine ON");
	}
	void acelerar() {
		System.out.println("VRUUUMMMM");
	}

}

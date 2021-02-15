package Exercicios;

public class Carro {
	String modelo;
	String cor;
	String marca;
	boolean ligado;
	int qt_combustivel;
	
	void status() {
		
		System.out.println("O modelo: " +this.modelo);
		System.out.println("A Cor:" +this.cor);
		System.out.println("A Marca: " +this.marca);
		System.out.println("Está ligado: " +this.ligado);
		System.out.println("Quanto de combustivel? " +this.qt_combustivel);
	}
	
	void ligar () {
		this.ligado = true;
		
	}
	
	void desligado() {
		
		this.ligado = false;
		
		
	}
	

}

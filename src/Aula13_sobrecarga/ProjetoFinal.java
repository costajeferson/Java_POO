package Aula13_sobrecarga;

public class ProjetoFinal {

	public static void main(String[] args) {
		//Programa Principal
		
		Cachorro c = new Cachorro();
		c.emitirSom();
		
		c.reagir("Olá"); // reagindo com frase
		c.reagir(12, 10); // com idade e peso
		c.reagir(24, 20); // com hora e minuto

	}

}

package Aula12_sobreposicao;

public class ProjetoAnimal {

	public static void main(String[] args) {
		
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();			
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		m.setPeso(35.5f);
		m.setCorPelo("Marrom");
		m.setIdade(2);
		m.alimentar();
		m.locomover();
		
		Cachorro c = new Cachorro();
		c.setNome("Maggie");
		c.alimentar();
		c.locomover();
		c.latir();
			

	}

}

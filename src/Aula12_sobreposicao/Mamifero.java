package Aula12_sobreposicao;

public class Mamifero extends Animal {

	private String CorPelo;
	
	@Override
	public void locomover() {
		System.out.println("Correndo");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Mamifero");
		
	}

	public String getCorPelo() {
		return CorPelo;
	}

	public void setCorPelo(String corPelo) {
		CorPelo = corPelo;
	}
	

}

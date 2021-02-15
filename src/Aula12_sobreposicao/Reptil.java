package Aula12_sobreposicao;

public class Reptil extends Animal{
	
	private String CorEscama;

	@Override
	public void locomover() {
		System.out.println("Rastejando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Alimento de Reptil");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Reptil");
	}

	public String getCorEscama() {
		return CorEscama;
	}

	public void setCorEscama(String corEscama) {
		CorEscama = corEscama;
	}

}

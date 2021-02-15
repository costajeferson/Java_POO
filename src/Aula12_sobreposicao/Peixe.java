package Aula12_sobreposicao;

public class Peixe extends Animal{
	
	private String corEscama;

	@Override
	public void locomover() {
		System.out.println("Nadando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Alimento de Peixe");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Peixe");
		
	}
	
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	public void soltarBolha() {
		System.out.println("Soltar Bolha");
	}
	

}

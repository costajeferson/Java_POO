package Aula11;

public class Bolsista extends Aluno{

	private float bolsa;
	
	public void renovaBolsa() {
		System.out.println("Renovando Bolsa de " +this.getNome());
	}
	
	@Override
	public void pagaMensalidade() {
		System.out.println("Pagando mensalidade de Bolsista!!" + this.getNome());
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	
	
}

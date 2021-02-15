package Aula12_sobreposicao;

public class Cachorro extends Mamifero{
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void latir() {
		System.out.println("Latindo");
	}

}

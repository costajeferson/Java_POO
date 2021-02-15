package Aula12_sobreposicao;

public abstract class  Animal {
	
	//atributos animal
	protected float peso;
	protected int idade;
	protected int membros;
	
	//metodos de Animal
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}
	
	
	
	
}

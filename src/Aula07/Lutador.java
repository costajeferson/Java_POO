package Aula07;

public class Lutador {
	
	//Atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int impate;
	
	//metodos publicos
	public void apresentar() {
		System.out.println("-------- Lutador ---------");
		System.out.println("Nome: " +this.getNome());
		System.out.println("Nacionalidade: " +this.getNacionalidade());
		System.out.println("Idade: " +this.getIdade());
		System.out.println("Altura: " +this.getAltura());
		System.out.println("Peso: " +this.getPeso());
		System.out.println("Categoria: " +this.getCategoria());
		System.out.println("Ganhou: " +this.getVitorias());
		System.out.println("Perdeu: " +this.getDerrotas());
		System.out.println("Empatou: " +this.getImpate());
		
		
	}
	
	public void status() {
		System.out.println("---------- Resumo Lutador --------------");
		System.out.println("Nome: " +this.getNome());
		System.out.println("Categoria: " +this.getCategoria());
		System.out.println("Vitorias: " +this.getVitorias());
		System.out.println("Derrotas: " +this.getDerrotas());
		System.out.println("Empates: " +this.getImpate());
		
	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
		
	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas()+1);
	}
	public void empatarLuta() {
		this.setImpate(this.getImpate() + 1);
	}

	//metodos Especiais
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
			int impate) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.impate = impate;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria() {
		if(this.peso <52.2) {
			this.categoria = "Inválido";
		}else if (this.peso <=70.3) {
			this.categoria = "Leve";
			
		}else if(this.peso <=83.0) {
			this.categoria = "Médio";
		}else if(this.peso <=120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Inválido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getImpate() {
		return impate;
	}

	public void setImpate(int impate) {
		this.impate = impate;
	}
	
	
	
	
	


}

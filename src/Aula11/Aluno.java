package Aula11;

public class Aluno extends Pessoa{

	private int matricula;
	private String curso;
	
	public void pagaMensalidade() {
		System.out.println("Pagando mensalidade de Aluno!!" + this.getNome());
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
}

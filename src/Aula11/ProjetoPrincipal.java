package Aula11;

public class ProjetoPrincipal {

	public static void main(String[] args) {
		
		Visitante v1 = new Visitante();
		
		v1.setNome("Visitante: Jeferson");
		v1.setIdade(25);
		v1.setSexo("Masculino");
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Visitante: Jeferson");
		a1.setIdade(25);
		a1.setSexo("Masculino");
		a1.setMatricula(9999);
		a1.setCurso("Informática");
		System.out.println(a1.toString());
		a1.pagaMensalidade();
		System.out.println(a1.toString());
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Maggie");
		b1.setMatricula(89898);
		b1.setBolsa(12.5f);
		b1.setSexo("Masculino");
		b1.pagaMensalidade();
		
		
		
		
		
		
				

	}

}

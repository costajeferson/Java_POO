package Aula10;

public class ProjetoPessoas {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		
		p1.setNome("Jeferson");
		p1.setSexo("Masculino");
		
		p2.setNome("Maggie");
		p2.setIdade(1);
		p2.setCurso("Informática");
		
		
		p3.setNome("Thaina");
		p3.setSalario(2300);
		
		p4.setNome("Catarina");
		p4.setSexo("Feminino");
		p4.setIdade(8);
		
		
		//p1.receberAumento(550.20f);
		//p2.mudarTrabalho();
		//p4.cancelarMatr();
		
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		

	}

}

package br.com.oo.aula4;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.setNome("Maria");
		aluno.setMatricula(1234);
		aluno.setNota1(6);
		aluno.setNota2(8);
		
		System.out.println("Média: " + aluno.calcularMedia());
		System.out.println(aluno.verificarAprovacao());
	}

}

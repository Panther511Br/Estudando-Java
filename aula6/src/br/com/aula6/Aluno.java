package br.com.aula6;

public class Aluno {

	String nome;
	int matricula;
	double nota1, nota2, media;
	
	Aluno(String nome, int matricula) {
		this.nome=nome;
		this.matricula=matricula;
	}
	
	public double calcularMedia() {
		this.media = (this.nota1+this.nota2)/2;
		return media;
	}
	
	public void verificarAprovacao() {
		double resultado = calcularMedia();
		
		System.out.printf("Aluno " + this.nome);
		System.out.printf("\nMedia %.2f \n", resultado);
		
		if (resultado>=7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}
}

package br.com.oo.aula4;

public class Aluno {
	private String nome;
	private int matricula;
	private float nota1, nota2;
	
	public double calcularMedia() {
		return (nota1+nota2) / 2;	
	}
	
	public String verificarAprovacao() {
		return calcularMedia() >= 7 ? "Aprovado" : "Reprovado";
		// '? :' eh um "if simplificado". Se a media ≥ 7 → retorna "Aprovado".
		// Senao → retorna "Reprovado"
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	
}

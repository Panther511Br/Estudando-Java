package br.com.aula6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("---- Cadastro de aluno ----");
		
		System.out.println("Nome do Aluno");
		String nomeInformado = leitor.nextLine();
		
		System.out.println("Matricula do Aluno");
		int matriculaInformada = leitor.nextInt();
		
		
		Aluno aluno = new Aluno(nomeInformado, matriculaInformada);
		
		System.out.println("Informe a primeira Nota");
		aluno.nota1 = leitor.nextFloat();
		
		System.out.println("Informe a segunda Nota");
		aluno.nota2 = leitor.nextFloat();
		
		aluno.calcularMedia();
		aluno.verificarAprovacao();
		
		leitor.close();
	}

}

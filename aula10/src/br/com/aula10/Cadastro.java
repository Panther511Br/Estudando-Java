package br.com.aula10;

public class Cadastro {
	private String nome;
	private int  idade;
	
	Cadastro(String nome, int idade){
		this.nome=nome;
		this.idade=idade;
	}
	
	public void verificarIdade() throws MenorDeIdadeException {
		if (this.idade < 18) {
			throw new MenorDeIdadeException("Erro: o usuario " + nome
					+ " é menor de idade (Idade: " + idade + ")");
		}
		System.out.println("Cadastro realizado com sucesso!");
	}
}

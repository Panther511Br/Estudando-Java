package br.com.aula5.parte2;

public class Principal {

	public static void main(String[] args) {
		Carro carro = new Carro();
		// Sem o metodo construtor
		
		carro.marca="Volkswagen";
		carro.modelo="gol";
		carro.ano="2014";
		carro.exibirInformacoes();
	}

}

package br.com.br.aula4_parte2;

public class Principal {

	public static void main(String[] args) {
	Produto produto = new Produto("Chocolate", 0, 0);
	// Agora com o metodo construtor eu tenho que definir os valores na hora de criar um produto.
	
	produto.preco=50;
	produto.quantidade=10;
	produto.calcularValorEstoque();
	System.out.printf("Total de estoque: %.2f", produto.calcularValorEstoque());

	}

}

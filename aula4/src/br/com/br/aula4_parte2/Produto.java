package br.com.br.aula4_parte2;

public class Produto {
	String nome;
	double preco;
	int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	} // Metodo construtor, gracas a ele que podemos criar um objeto a partir da classe Produto.
	// Pode ser burlado usando apenas getters e setters, mas pode dar bug se fizer assim.
	
	public double calcularValorEstoque() {
		return preco * quantidade;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

}

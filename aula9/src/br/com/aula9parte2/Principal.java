package br.com.aula9parte2;

public class Principal {

	public static void main(String[] args) {
		Produto p = new Produto("camisa", 10);
		p.ExibirEstoque();
		p.Vender(5);
		p.ExibirEstoque();
		
		Produto produto = new Produto("Barril", 20);
		produto.ExibirEstoque();
		produto.Vender(15);
		produto.ExibirEstoque();
	}

}

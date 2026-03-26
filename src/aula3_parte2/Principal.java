package aula3_parte2;

public class Principal {

	public static void main(String[] args) {
		Produto p = new Produto();
		
		p.setNomeProduto("Computador I7");
		p.exibirEstoque();
		p.comprarproduto(10);
		p.exibirEstoque();
		p.venderproduto(5);
		p.exibirEstoque();
	}

}

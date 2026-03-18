package aula3;

public class Principal {

	public static void main(String[] args) {
		
		Produto p = new Produto();
		// Cria um objeto baseado na classe Produto, que se chama p.
		
		p.nomeProduto="Computador";
		
		System.out.printf("%s", p.nomeProduto);
		
	}

}
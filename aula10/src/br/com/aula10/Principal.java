package br.com.aula10;

public class Principal {

	public static void main(String[] args) {
		Cadastro user1 = new Cadastro("Alice", 25);
		Cadastro user2 = new Cadastro("Bob", 16);
		
		try {
			user1.verificarIdade();
			user2.verificarIdade();
		} catch(MenorDeIdadeException e) {
			System.err.println(e.getMessage());
		}

	}

}

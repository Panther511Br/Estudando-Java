
package br.com.aula10;

public class MenorDeIdadeException extends Exception {
	
	// Construtor padrão (sem argumentos) com mensagem fixa
	public MenorDeIdadeException() {
		super("Usuário menor de idade");
	}
	
	// Construtor que permite uma mensagem personalizada
	public  MenorDeIdadeException(String mensagem) {
		super(mensagem);
	}
}

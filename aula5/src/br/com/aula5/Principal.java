package br.com.aula5;

public class Principal {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("Pedro", 5000.00, "123456");
		
		conta.exibirStatus();
	}

}

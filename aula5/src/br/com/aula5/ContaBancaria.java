package br.com.aula5;

public class ContaBancaria {
	String titular;
	double saldo;
	String numeroConta;
	
	ContaBancaria(String titular, double saldo, String numeroConta) {
		this.titular = titular;
		this.saldo = saldo;
		this.numeroConta = numeroConta;
		
	}
	
	// Metodo para depositar valor.
	void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.printf("Deposito de %.2f realizado com sucesso. %n", valor);
		} else {
			System.out.println("Valor inválido. %n");
		}	
	}
	// Metodo para sacar valor.
	void sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
		} else if (valor <= 0) {
			System.out.printf("Valor %.2f inválido para sacar.", valor);
			
		} else {
			System.out.printf("Saldo insuficiente para o saque de %.2f %n", valor);
		}
	}
	// Metodo para exibir os dados atuais
	void exibirStatus() {
		System.out.println("------------------------");
		System.out.printf("Conta %s %n", numeroConta);
		System.out.printf("Titular %s %n", titular);
		System.out.printf("Saldo %.2f %n", saldo);
		System.out.printf("-------------------------");
	}
}

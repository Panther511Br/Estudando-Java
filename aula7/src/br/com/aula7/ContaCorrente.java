package br.com.aula7;

import javax.swing.JOptionPane;

public class ContaCorrente {
	String nome;
	double saldo;
	
	// Construtor da classe
	public ContaCorrente(String nome, double saldo) {
		this.nome=nome;
		this.saldo=saldo;
	}
	// Método para depositar
	public void  depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			JOptionPane.showMessageDialog(null, "Depósito de R$ " + valor + "realizado com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Valor inválido para depósito.");
		}
	}
	
	// Método para exibir o saldo
	public void exibirSaldo() {
		JOptionPane.showMessageDialog(null, "Saldo atual de " + nome + ": R$" + saldo);
	}
}

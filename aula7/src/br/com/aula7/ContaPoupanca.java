package br.com.aula7;

import javax.swing.JOptionPane;

//Essa classe herda da classe ContaCorrente
public class ContaPoupanca extends ContaCorrente {

	// Construtor
	public ContaPoupanca(String nome, double saldo) {
		super(nome, saldo);
	}
	
	public void aplicarRendimentos(double taxaPercentual) {
		if (taxaPercentual > 0) {
			double rendimento = this.saldo * (taxaPercentual/100);
			this.saldo += rendimento;
		JOptionPane.showMessageDialog(null, String.format("Rendimento de percentual %.2f"));
		}
	}
}

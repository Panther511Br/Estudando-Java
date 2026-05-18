package br.com.aula7;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// Criando uma conta
		ContaCorrente conta = new ContaCorrente("Pedro", 0);
		conta.depositar(1000);
		conta.exibirSaldo();
		
		
		ContaPoupanca contap = new ContaPoupanca("Pedro", 500);
		
		contap.aplicarRendimentos(0.5);
		
		contap.exibirSaldo();
		
		JOptionPane.showMessageDialog(null, "Processo finalizado com sucesso!");
	}
}

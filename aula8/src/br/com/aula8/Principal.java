package br.com.aula8;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String nomeLido = JOptionPane.showInputDialog("Informe seu nome");
		String departamentoLido = JOptionPane.showInputDialog("Informe seu departamento");
		String salarioLido = JOptionPane.showInputDialog("Informe seu salario");
		
		float salarioConvertido = Float.parseFloat(salarioLido);
		
		Gerente gerente = new Gerente(nomeLido, departamentoLido, salarioConvertido);
		
		gerente.ExibirDados();
	}
	

}

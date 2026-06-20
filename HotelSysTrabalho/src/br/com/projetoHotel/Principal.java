package br.com.projetoHotel;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome do hospede ");
		
		String valor = JOptionPane.showInputDialog("Digite o preço da diária ");
		double precoDiaria = Double.parseDouble(valor);
		
		HospedagemLuxo luxo = new HospedagemLuxo(nome, precoDiaria);
		
		JOptionPane.showMessageDialog(null, "Cadastro realizado!");
		
		// Hospede bebe refrigerante de R$ 10,00
		luxo.adicionarMinibar(10.00);
		
		//Hospede consome lanche de R$ 15,00
		luxo.adicionarMinibar(15.00);
		
		luxo.fecharConta();
	}

}

package br.com.aula9;

import javax.swing.JOptionPane;

public class Carro extends Veiculo {
	protected int quantidadePortas;
	
	public Carro(String marca, String modelo,int quantidadePortas) {
		super(marca, modelo);
		this.quantidadePortas=quantidadePortas;
	}

	
	@Override
	public void exibirDados() {
		JOptionPane.showMessageDialog(null, "Marca " + marca + "\nModelo " + modelo + "\nQuantidade de Portas " + quantidadePortas);
	}
// @Override "reescreve" o metodo, pois muitas vezes o comportamento da classe pai nao serve para a classe filha.
}

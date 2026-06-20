package br.com.aula9parte2;

import javax.swing.JOptionPane;

public class Produto {
	static public int ID = 0;
	public String nome;
	private int estoque;
	
	public Produto(String nome, int estoque) {
		this.nome=nome;
		this.estoque=estoque;
		ID = ID + 1;
	}
	
	public void Vender(int qtde) {
		if (estoque > 0) {
			estoque -= qtde;
		} else {
			JOptionPane.showMessageDialog(null, "O valor " + qtde + "não é compatível com o estoque " + estoque);
		}
	}
	
	public void ExibirEstoque() {
		JOptionPane.showMessageDialog(null, "Nome " + nome +
											"\nID " + ID +
											"\nEstoque " + estoque );
	}
}

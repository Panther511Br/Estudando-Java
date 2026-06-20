package br.com.projetoHotel;

import javax.swing.JOptionPane;

public class Hospedagem {
	String nomeHospede;
	double precoDiaria;
	
	public Hospedagem(String nomeHospede, double precoDiaria) {
		this.nomeHospede=nomeHospede;
		this.precoDiaria=precoDiaria;
	}

	public void exibirDados() {
		JOptionPane.showMessageDialog(null, "Nome " + nomeHospede +
										"\nPreco " + precoDiaria);
	}

	public String getNomeHospede() {
		return nomeHospede;
	}

	public void setNomeHospede(String nomeHospede) {
		this.nomeHospede = nomeHospede;
	}

	public double getPrecoDiaria() {
		return precoDiaria;
	}

	public void setPrecoDiaria(double precoDiaria) {
		this.precoDiaria = precoDiaria;
	}
	
}

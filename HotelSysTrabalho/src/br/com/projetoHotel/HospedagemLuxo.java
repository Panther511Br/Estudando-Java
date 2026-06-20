
package br.com.projetoHotel;

import javax.swing.JOptionPane;

public class HospedagemLuxo extends Hospedagem{
	double valorMinibar=0;
	
	public HospedagemLuxo(String nomeHospede, double precoDiaria) {
		super(nomeHospede, precoDiaria);
		this.valorMinibar=0.0;
	}
	
	public void adicionarMinibar(double valorItem) {
		this.valorMinibar += valorItem;
	}
	
	public double computarConsumo(int qtdDias) {
		double totalParcial = (precoDiaria * qtdDias) + this.valorMinibar;
		return totalParcial * 1.10;
	}
	
	public void fecharConta() {
		String input = JOptionPane.showInputDialog("Quantos dias o hospede " + nomeHospede + " ficou hospedado?");
		int dias = Integer.parseInt(input);
		
		double valorFinal = computarConsumo(dias);		
		
		String extrato = String.format("Hospede: %S" + "\nValor total a pagar %.2f", nomeHospede, valorFinal);
		JOptionPane.showMessageDialog(null, extrato);
	}

	public double getValorMinibar() {
		return valorMinibar;
	}

	public void setValorMinibar(double valorMinibar) {
		this.valorMinibar = valorMinibar;
	}
}

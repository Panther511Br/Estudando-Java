package br.com.aula8;

import javax.swing.JOptionPane;

public class Gerente extends Funcionario {
	
	String departamento;
	float salario;
	
	public Gerente(String nome,String departamento, float salario) {
		super(nome);
		this.departamento=departamento;
		this.salario=salario;	
	}

	public void ExibirDados() {
		String dados = "Nome " + nome +
				"\nDepartamento " + departamento +
				"\nSalario " + salario;
		JOptionPane.showMessageDialog(null, dados);
	}
}

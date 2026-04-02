
package br.com.aula5.parte2;

public class Carro {
	String marca;
	String modelo;
	String ano;
	
	void exibirInformacoes() {
		System.out.printf("Marca %s %n", marca);
		System.out.printf("Modelo %s %n", modelo);
		System.out.printf("Ano %s %n", ano);
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

}

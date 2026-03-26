package aula3_parte2;

public class Produto {
	private String nomeProduto;
	private float preco;
	private float estoque;
	
	public void exibirEstoque() {
		System.out.printf("O saldo do produto %s é %f %n", nomeProduto, estoque);	
	}
	
	public void comprarproduto(double qtde) {
		if (qtde > 0) {
			this.estoque += qtde;
			// 'this' eh usado pra se referir ao atributo, da instância atual da classe.
		}
	}
	void venderproduto(double qtde) {
		if (qtde > 0 && this.estoque > 0) {
			this.estoque -= qtde;
		} else {
			System.out.printf("Sem estoque. Estoque atual: %f", estoque);
		}
		
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getEstoque() {
		return estoque;
	}
	
}

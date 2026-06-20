package br.com.aula11;

public class Aluno {
	private int id; 
	private String nome; 
	private String fone; 
	
	public Aluno() {} 
	public Aluno(String nome, String fone) { 
		this.nome = nome; 
		this.fone = fone; 
	} 
	public int getId() { 
		return id; 
	} 
	public void setId(int id) { 
		this.id = id; 
	} 
	public String getNome() { 
		return nome; 
	} 
	public void setNome(String nome) { 
		this.nome = nome; 
	} 
	public String getFone() { 
		return fone; 
	} 
	public void setFone(String fone) { 
		this.fone = fone; 
	} 
}

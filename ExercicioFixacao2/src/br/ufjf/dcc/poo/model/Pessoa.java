package br.ufjf.dcc.poo.model;

public abstract class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	/// Getters
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public String getSexo() {
		return sexo;
	}
	
	/// Setters
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}

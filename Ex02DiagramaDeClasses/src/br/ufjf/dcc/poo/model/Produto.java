package br.ufjf.dcc.poo.model;

public class Produto {
	private String nomeProduto;
	private int peso;
	private int qtdeDisponivel;
	
	/// Getters
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public int getQtdeDisponivel() {
		return qtdeDisponivel;
	}
	
	/// Setters
	
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public void setQtdeDisponivel(int qtdeDisponivel) {
		this.qtdeDisponivel = qtdeDisponivel;
	}
	
	/// Methods
	
	public Produto consultarProduto() {
		return null;
	}
	
}

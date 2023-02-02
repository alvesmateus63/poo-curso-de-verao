package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class ItemPedido {
	private int quantidade;
	private double preco;
	private ArrayList<Produto> produtos;
	
	/// Getters
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	
	/// Setters
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
	/// Methods
	
	public int incluirItem() {return 0;}
	public int excluirItem() {return 0;}

	
}

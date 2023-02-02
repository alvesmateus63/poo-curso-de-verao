package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class ItemPedido {
	private int quantidade;
	private double preco;
	private Pedido pedido;
	private Produto produto;
	
	/// Getters
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public Pedido getPedido() {
		return pedido;
	}

	public Produto getProduto() {
		return produto;
	}
	
	
	/// Setters
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	/// Methods
	
	public int incluirItem() {return 0;}
	public int excluirItem() {return 0;}

	

	

	
}

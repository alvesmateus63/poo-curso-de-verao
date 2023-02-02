package br.ufjf.dcc.poo.model;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
	private Date dataPedido;
	private String vendedor;
	private String status;
	private String observacoes;
	private ArrayList<ItemPedido> itensPedidos;
	
	/// Getters
	
	public Date getDataPedido() {
		return dataPedido;
	}
	 
	public String getVendedor() {
		return vendedor;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String getObservacoes() {
		return observacoes;
	}
	
	public ArrayList<ItemPedido> getItensPedidos() {
		return itensPedidos;
	}
	
	/// Setters
	
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	/// Methods
	
	public void encerrarPedido() {}	
	public void cancelarPedido() {}


	
}

package br.ufjf.dcc.poo.model;

import java.util.Date;

public abstract class Pessoa {
	private String nome;
	private Date dataNasc;
	
	/// Getters
	
	public String getNome() {
		return nome;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	
	/// Setters
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public int calculaIdade() {return 0;}
	
}

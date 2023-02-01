package br.ufjf.dcc.poo.model;

public abstract class Pessoa {
	private String nome;
	private String cpf;
	private String rg;
	private String sexo;
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getRg() {
		return rg;
	}
	public String getSexo() {
		return sexo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}

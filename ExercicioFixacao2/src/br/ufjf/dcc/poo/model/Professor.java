package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Professor extends Pessoa {
	private String codigo;
	private String formacao;
	private float horaAula;
	private int quantidadeAulas;
	private ArrayList<Disciplina> disciplinas;
	
	/// Getters
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getFormacao() {
		return formacao;
	}
	
	public float getHoraAula() {
		return horaAula;
	}
	
	public int getQuantidadeAulas() {
		return quantidadeAulas;
	}
	
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	
	/// Setters
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	public void setHoraAula(float horaAula) {
		this.horaAula = horaAula;
	}
	
	public void setQuantidadeAulas(int quantidadeAulas) {
		this.quantidadeAulas = quantidadeAulas;
	}
	
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
	/// Methods
	
	private float calcularPagamento() {
		return 0;
	}

	
	
}

package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Aluno extends Pessoa {
	private String matricula;
	private double mensalidade;
	private double bolsa;
	// Cada aluno pode ter várias disciplinas, por isso uma lista
	private ArrayList<Disciplina> disciplinas;
	
	/// Getters
	
	public String getMatricula() {
		return matricula;
	}
	
	public double getMensalidade() {
		return mensalidade;
	}
	
	public double getBolsa() {
		return bolsa;
	}
	
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	/// Setters
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	public void setBolsa(double bolsa) {
		this.bolsa = bolsa;
	}
	
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
	
	/// Methods
	
	private double calcularMensalidade() {
		return 0;
	}

	
	
}

package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Disciplina {
	private String nome;
	private int cargaHoraria;
	private ArrayList<Aluno> alunos;
	private Professor professor;
	
	/// Getters
	
	public String getNome() {
		return nome;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	
	public Professor getProfessor() {
		return professor;
	}

	
	/// Setters
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}


	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
}

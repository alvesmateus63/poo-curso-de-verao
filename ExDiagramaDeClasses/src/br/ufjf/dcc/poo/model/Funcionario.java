package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Funcionario extends Pessoa {
	private int matricula;
	private ArrayList<Atendimento> atendimentos;
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
}	

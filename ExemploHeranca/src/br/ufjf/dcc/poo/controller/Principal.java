package br.ufjf.dcc.poo.controller;

import br.ufjf.dcc.poo.model.Aluno;
import br.ufjf.dcc.poo.model.Funcionario;
import br.ufjf.dcc.poo.model.Professor;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("AL");
		aluno.setCpf("123.456.789-00");
		aluno.setRg("MG-768729");
		aluno.setSexo("F");
		aluno.setMatricula("202007612");
		
		Professor professor = new Professor();
		professor.setNome("Luana");
		professor.setCpf("098.765.432-11");
		professor.setRg("MG-123456");
		professor.setSexo("F");
		professor.setSiape("123456");
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Rebecca");
		funcionario.setCpf("678.654.123-00");
		funcionario.setRg("MG-303920");
		funcionario.setSexo("F");
		funcionario.setRegistro("F2020D4");
		
		
	}

}

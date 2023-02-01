package br.ufjf.dcc.poo.controller;

import java.util.ArrayList;

import br.ufjf.dcc.poo.model.Aluno;
import br.ufjf.dcc.poo.model.Disciplina;
import br.ufjf.dcc.poo.model.Professor;

public class Principal {
	public static void main(String[] args) {
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setNome("POO");
		disciplina1.setCargaHoraria(60);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setNome("Modelagem");
		disciplina2.setCargaHoraria(60);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setNome("BD");
		disciplina3.setCargaHoraria(60);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setNome("Redes");
		disciplina4.setCargaHoraria(60);
		
		ArrayList<Disciplina> disciplinasAluno = new ArrayList<>();
		disciplinasAluno.add(disciplina1);
		disciplinasAluno.add(disciplina2);
		disciplinasAluno.add(disciplina3);
		
		ArrayList<Disciplina> disciplinasProfessor = new ArrayList<>();
		disciplinasProfessor.add(disciplina3);
		disciplinasProfessor.add(disciplina4);
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Blair");
		aluno.setIdade(19);
		aluno.setSexo("F");
		aluno.setMatricula("202006512");
		aluno.setMensalidade(950.00f);
		aluno.setBolsa(120.00f);
		aluno.setDisciplinas(disciplinasAluno);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Serena");
		aluno2.setIdade(20);
		aluno2.setSexo("F");
		aluno2.setMatricula("2020766512");
		aluno2.setMensalidade(950.00f);
		aluno2.setBolsa(180.00f);
		aluno2.setDisciplinas(disciplinasAluno);
		
		Professor professor = new Professor();
		professor.setNome("Rufus");
		professor.setIdade(36);
		professor.setSexo("M");
		professor.setFormacao("Doutorado");
		professor.setHoraAula(43.00f);
		professor.setQuantidadeAulas(15);
		professor.setDisciplinas(disciplinasProfessor);
		
		ArrayList<Aluno> alunosDisciplinas = new ArrayList<>();
		alunosDisciplinas.add(aluno);
		alunosDisciplinas.add(aluno2);
		
		Disciplina disciplina5 = new Disciplina();
		disciplina5.setNome("ED");
		disciplina5.setCargaHoraria(60);
		disciplina5.setProfessor(professor);
		disciplina5.setAlunos(alunosDisciplinas);
		
		for(Aluno a: disciplina5.getAlunos()) {
			System.out.println("Nome: " + a.getNome());
			System.out.println("Sexo: " + a.getSexo());
		}
		
	}
	
}

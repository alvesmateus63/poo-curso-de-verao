package br.ufjf.dcc.poo.exercicio21;

public class Aluno {
	private String matricula;
	private String nome;
	private double nota1;
	private double nota2;
	private double nota3;
	
	/// Getters
	
	public String getMatricula() {
		return matricula;
	}
	public String getNome() {
		return nome;
	}
	public double getNota1() {
		return nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public double getNota3() {
		return nota3;
	}
	
	/// Setters
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	/// Methods
	
	public double calcMedia() {
		return (this.nota1 + this.nota2 + this.nota3) / 3;
	}
	
	public String provaFinal() {
		double soma = this.nota1 + this.nota2 + this.nota3;
		
		if((soma/3) >= 6) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
		
	}
	
	
}

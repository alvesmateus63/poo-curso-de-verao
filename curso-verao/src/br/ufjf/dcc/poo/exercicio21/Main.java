package br.ufjf.dcc.poo.exercicio21;

public class Main {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		
		a1.setMatricula("2020076123");
		a1.setNome("João");
		a1.setNota1(5);
		a1.setNota2(10);
		a1.setNota3(4);
		
		System.out.println("Média: " + a1.calcMedia());
		System.out.println("Resultado: " + a1.provaFinal());

	}

}

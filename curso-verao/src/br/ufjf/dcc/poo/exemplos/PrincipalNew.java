package br.ufjf.dcc.poo.exemplos;

import java.util.List;

public class PrincipalNew {
	public static void main(String[] args) {
		PessoaNew p1 = new PessoaNew();
		p1.nome = "João";
		p1.idade = 21;
		
		PessoaNew p2 = new PessoaNew();
		p2.nome = "Alice";
		p2.idade = 34;
		
		System.out.println("Pessoas: ");
		
		System.out.println("Nome da pessoa 1: " + p1.nome);
		System.out.println("Idade da pessoa 1: " + p1.idade);
		
		System.out.println("Nome da pessoa 2: " + p2.nome);
		System.out.println("Idade da pessoa 2: " + p2.idade);
		
		List<PessoaNew> pessoas; // Armazenando um objeto(formado por atributos e métodos) numa lista
		
	}
}

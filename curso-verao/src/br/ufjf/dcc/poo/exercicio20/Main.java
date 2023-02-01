package br.ufjf.dcc.poo.exercicio20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Marian", 21, "F");
		Pessoa p2 = new Pessoa();
		
		p2.setNome("João");
		p2.setIdade(21);
		p2.setSexo("M");
		p2.setCpf("123.456.789-00");
		
		
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		Scanner t = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			Pessoa p = new Pessoa();
			System.out.println("Digite o nome: ");
			p.setNome(t.nextLine());
			System.out.println("Digite a idade: ");
			p.setIdade(Integer.parseInt(t.nextLine()));
			System.out.println("Digite o sexo: ");
			p.setSexo(t.nextLine());
			pessoas.add(p);
		}
		
		for(Pessoa p: pessoas) {
			System.out.println("O nome da pessoa é: " + p.getNome());
			System.out.println("A idade da pessoa é: " + p.getIdade());
			System.out.println("O sexo da pessoa é: " + p.getSexo());
		}
		
	}
}
package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class SequenciaInteiros {

	public static void main(String[] args) {
		Scanner t = new Scanner(System .in);
		
		int soma = 0, contador = 0;
		
		System.out.println("Digite um valor");
		
		int valor = t.nextInt();
		
		while(valor != -1) {
			soma += valor;
			System.out.println("Digite um valor");
			valor = t.nextInt();
			contador++;
		}
		
		System.out.println("Media: " + soma/contador);

	}

}

package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class InteiroImpares {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = t.nextInt();
		int contador = 0;
		
		while(valor != -1) {
			if(valor % 2 != 0) {
				contador++;
			}
			
			System.out.println("Digite um valor: ");
			valor = t.nextInt();
		}
		
		System.out.println("Impares: " + contador);

	}

}

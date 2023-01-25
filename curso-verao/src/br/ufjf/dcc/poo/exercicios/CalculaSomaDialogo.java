package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class CalculaSomaDialogo {

	public static void main(String[] args) {
		String num1, num2;
		
		num1 = JOptionPane.showInputDialog("Valor 1", null);
		num2 = JOptionPane.showInputDialog("Valor 2", null);
		
		/*Converter string p/ inteiro: Integer.parseInt(num1) */
		
		JOptionPane.showMessageDialog(null, Float.parseFloat(num1) + Float.parseFloat(num2));

	}

}

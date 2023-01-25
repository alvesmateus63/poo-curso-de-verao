package br.ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class ValorAbsoluto {

	public static void main(String[] args) {
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor", null));
		
		JOptionPane.showMessageDialog(null, (numero > 0 ? numero : -numero));

	}

}

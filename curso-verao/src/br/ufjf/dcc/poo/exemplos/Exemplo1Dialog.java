package br.ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class Exemplo1Dialog {

	public static void main(String[] args) {
		String nomeUsuario;
		nomeUsuario = JOptionPane.showInputDialog(null); // Abre uma caixa de texto
		JOptionPane.showMessageDialog(null, nomeUsuario); // Exibe uma caixa mensagem exibindo o texto

	}

}

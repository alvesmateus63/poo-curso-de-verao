package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Palpite {

	public static void main(String[] args) {
		int valor = (int)(Math.random() * 100);
		
		int palpite = Integer.parseInt(JOptionPane.showInputDialog("Chute um valor", null));
		
		while(palpite != valor) {
			if(palpite < 0 || palpite > 100) {
				JOptionPane.showMessageDialog(null, "Valor fora do limite");
			} 
			
			if (palpite > valor) {
				JOptionPane.showMessageDialog(null, "Chute um valor menor ");
				palpite = Integer.parseInt(JOptionPane.showInputDialog("Chute um valor", null));
			}
			
			if(palpite < valor) {
				JOptionPane.showMessageDialog(null, "Chute um valor maior ");
				palpite = Integer.parseInt(JOptionPane.showInputDialog("Chute um valor", null));
			} 
			
			if(valor == palpite){
				JOptionPane.showMessageDialog(null, "Valor encontrado");
			}
		}
		
		
	}

}

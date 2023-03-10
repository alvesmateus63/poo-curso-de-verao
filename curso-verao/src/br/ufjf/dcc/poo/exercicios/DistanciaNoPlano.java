package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class DistanciaNoPlano {

	public static void main(String[] args) {
		float p1x, p1y, p2x, p2y;
		
		p1x = Float.parseFloat(JOptionPane.showInputDialog("Ponto x1", null));
		p2x = Float.parseFloat(JOptionPane.showInputDialog("Ponto x2", null));
		p1y = Float.parseFloat(JOptionPane.showInputDialog("Ponto y1", null));
		p2y = Float.parseFloat(JOptionPane.showInputDialog("Ponto y2", null));
		
		float resultado = (float) Math.sqrt(Math.pow(p2x-p1x, 2) + Math.pow(p2y-p1y, 2));
		
		JOptionPane.showMessageDialog(null, resultado);

	}

}

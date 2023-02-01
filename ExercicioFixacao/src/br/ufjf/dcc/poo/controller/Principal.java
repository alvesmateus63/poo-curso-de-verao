package br.ufjf.dcc.poo.controller;

import br.ufjf.dcc.poo.model.Automovel;
import br.ufjf.dcc.poo.model.Caminhao;

public class Principal {

	public static void main(String[] args) {
		Automovel carro1 = new Automovel();
		
		carro1.setCapacidadeTanque(55);
		carro1.setKmPorLitro(15);
		carro1.setMarca("BMW");
		
		System.out.println(carro1.calcularConsumo(5.11f));
		
		Caminhao c1 = new Caminhao();
		
		c1.setCapacidadeTanque(300);
		c1.setKmPorLitro(3);
		c1.setMarca("Mercedes");
		c1.setTara(1500);
		
		System.out.println(c1.calcularConsumo(5.11f));

	}

}

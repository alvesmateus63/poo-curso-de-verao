package br.ufjf.dcc.poo.model;

public class Veiculo {
	private String marca;
	private float capacidadeTanque;
	private float kmPorLitro;
	
	/// Getters

	public String getMarca() {
		return marca;
	}

	public float getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public float getKmPorLitro() {
		return kmPorLitro;
	}

	/// Setters
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setCapacidadeTanque(float capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public void setKmPorLitro(float kmPorLitro) {
		this.kmPorLitro = kmPorLitro;
	}
	
	public double calcularConsumo(double precoLitro) {
		return 0;
	}
	
}

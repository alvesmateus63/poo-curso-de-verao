package br.ufjf.dcc.poo.model;

public class Caminhao extends Veiculo {
	private Number licenca;
	private Number valorEstimado;
	
	public Number getLicenca() {
		return licenca;
	}
	
	public Number getValorEstimado() {
		return valorEstimado;
	}
	
	public void setLicenca(Number licenca) {
		this.licenca = licenca;
	}
	
	public void setValorEstimado(Number valorEstimado) {
		this.valorEstimado = valorEstimado;
	}
}

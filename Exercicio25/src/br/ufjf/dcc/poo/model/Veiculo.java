package br.ufjf.dcc.poo.model;

import java.util.Date;

public abstract class Veiculo {
	private String numeroPlaca;
	private String modelo;
	private Date dataUltimaRevisao;

	public String getNumeroPlaca() {
		return numeroPlaca;
	}

	public String getModelo() {
		return modelo;
	}

	public Date getDataUltimaRevisao() {
		return dataUltimaRevisao;
	}

	public void setNumeroPlaca(String numeroPlaca) {
		this.numeroPlaca = numeroPlaca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setDataUltimaRevisao(Date dataUltimaRevisao) {
		this.dataUltimaRevisao = dataUltimaRevisao;
	}
	
	private Date proxRevisao() {
		return;
	}

}

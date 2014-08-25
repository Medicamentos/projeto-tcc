package br.com.medicamento.insumo.viewmodel;

import br.com.medicamento.insumo.bean.Cargo;

public class CargoViewModel {

	private Integer codigoCargo;
	private String descricaoCargo;
	
	public CargoViewModel(Cargo cargo){
		this.codigoCargo = cargo.getCodigoCargo();
		this.descricaoCargo = cargo.getDescricaoCargo();
	}

	public Integer getCodigoCargo() {
		return codigoCargo;
	}

	public void setCodigoCargo(Integer codigoCargo) {
		this.codigoCargo = codigoCargo;
	}

	public String getDescricaoCargo() {
		return descricaoCargo;
	}

	public void setDescricaoCargo(String descricaoCargo) {
		this.descricaoCargo = descricaoCargo;
	}

}

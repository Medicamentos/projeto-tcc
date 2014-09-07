package br.com.medicamento.insumo.viewmodel;

import br.com.medicamento.insumo.bean.TipoUnidade;

public class TipoUnidadeViewModel {

	private Integer codigoTipoUnidade;
	private String descricaoTipoUnidade;

	public TipoUnidadeViewModel(){
		
	}
	
	public TipoUnidadeViewModel(TipoUnidade tipoUnidade){
		this.codigoTipoUnidade = tipoUnidade.getCodigoTipoUnidade();
		this.descricaoTipoUnidade = tipoUnidade.getDescricaoTipoUnidade();
	}
	
	public Integer getCodigoTipoUnidade() {
		return codigoTipoUnidade;
	}

	public void setCodigoTipoUnidade(Integer codigoTipoUnidade) {
		this.codigoTipoUnidade = codigoTipoUnidade;
	}

	public String getDescricaoTipoUnidade() {
		return descricaoTipoUnidade;
	}

	public void setDescricaoTipoUnidade(String descricaoTipoUnidade) {
		this.descricaoTipoUnidade = descricaoTipoUnidade;
	}

}

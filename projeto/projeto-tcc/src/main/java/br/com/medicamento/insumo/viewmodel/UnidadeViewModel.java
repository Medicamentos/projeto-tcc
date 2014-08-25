package br.com.medicamento.insumo.viewmodel;

import br.com.medicamento.insumo.bean.Unidade;

public class UnidadeViewModel {

	private Integer codigoUnidade;
	private String descricaoUnidade;
	
	public UnidadeViewModel(Unidade unidade){
		this.codigoUnidade = unidade.getCodigoUnidade();
		this.descricaoUnidade = unidade.getNomeUnidade();
	}

	public Integer getCodigoUnidade() {
		return codigoUnidade;
	}

	public void setCodigoUnidade(Integer codigoUnidade) {
		this.codigoUnidade = codigoUnidade;
	}

	public String getDescricaoUnidade() {
		return descricaoUnidade;
	}

	public void setDescricaoUnidade(String descricaoUnidade) {
		this.descricaoUnidade = descricaoUnidade;
	}

}

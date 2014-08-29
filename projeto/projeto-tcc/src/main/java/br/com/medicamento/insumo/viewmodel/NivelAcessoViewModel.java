package br.com.medicamento.insumo.viewmodel;

import br.com.medicamento.insumo.bean.NivelAcesso;

public class NivelAcessoViewModel {

	private Integer codigoNivelAcesso;
	private String descricaoNivelAcesso;
	
	public NivelAcessoViewModel(NivelAcesso nivelAcesso){
		this.codigoNivelAcesso = nivelAcesso.getCodigoNivelAcesso();
		this.descricaoNivelAcesso = nivelAcesso.getDescricaoNivelAcesso();
	}

	public Integer getCodigoNivelAcesso() {
		return codigoNivelAcesso;
	}

	public void setCodigoNivelAcesso(Integer codigoNivelAcesso) {
		this.codigoNivelAcesso = codigoNivelAcesso;
	}

	public String getDescricaoNivelAcesso() {
		return descricaoNivelAcesso.replace("ROLE_", "");
	}

	public void setDescricaoNivelAcesso(String descricaoNivelAcesso) {
		this.descricaoNivelAcesso = descricaoNivelAcesso;
	}

}

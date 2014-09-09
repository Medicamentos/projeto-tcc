package br.com.medicamento.insumo.viewmodel;

import br.com.medicamento.insumo.bean.Bairro;
import br.com.medicamento.insumo.bean.Regiao;

public class BairroViewModel {

	private Integer codigoBairro;
	private String nomeBairro;
	private Regiao regiao;
	
	public BairroViewModel(Bairro bairro) {
		this.codigoBairro = bairro.getCodigoBairro();
		this.nomeBairro = bairro.getNomeBairro();
		this.regiao = bairro.getRegiao();
	}
	public Integer getCodigoBairro() {
		return codigoBairro;
	}
	public void setCodigoBairro(Integer codigoBairro) {
		this.codigoBairro = codigoBairro;
	}
	public String getNomeBairro() {
		return nomeBairro;
	}
	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}
	public Regiao getRegiao() {
		return regiao;
	}
	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}
	
	
}

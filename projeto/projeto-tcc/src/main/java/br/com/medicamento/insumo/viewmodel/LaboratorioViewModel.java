package br.com.medicamento.insumo.viewmodel;

import java.util.List;

public class LaboratorioViewModel {
	
	private Integer codigoLaboratorio;
	private String nomeLaboratorio;
	private  int codigoSelecionadoLaboratorio;
	private List<LaboratorioViewModel> listaLaboratorio;

	public LaboratorioViewModel() {
		super();
	}
	public Integer getCodigoLaboratorio() {
		return codigoLaboratorio;
	}
	public void setCodigoLaboratorio(Integer codigoLaboratorio) {
		this.codigoLaboratorio = codigoLaboratorio;
	}
	public String getNomeLaboratorio() {
		return nomeLaboratorio;
	}
	public void setNomeLaboratorio(String nomeLaboratorio) {
		this.nomeLaboratorio = nomeLaboratorio;
	}
	public int getCodigoSelecionadoLaboratorio() {
		return codigoSelecionadoLaboratorio;
	}
	public void setCodigoSelecionadoLaboratorio(int codigoSelecionadoLaboratorio) {
		this.codigoSelecionadoLaboratorio = codigoSelecionadoLaboratorio;
	}
	public List<LaboratorioViewModel> getListaLaboratorio() {
		return listaLaboratorio;
	}
	public void setListaLaboratorio(List<LaboratorioViewModel> listaLaboratorio) {
		this.listaLaboratorio = listaLaboratorio;
	}
	
	
}

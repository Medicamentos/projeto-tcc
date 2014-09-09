package br.com.medicamento.insumo.viewmodel;

import br.com.medicamento.insumo.bean.Bairro;
import br.com.medicamento.insumo.bean.TipoUnidade;
import br.com.medicamento.insumo.bean.Unidade;

public class UnidadeViewModel {

	private Integer codigoUnidade;
	private String descricaoUnidade;
	private String descricaoEndereco;
	private Integer cep;
	private Long numeroTelefone1;
	private Long numeroTelefone2;
	private Bairro bairro;
	private TipoUnidade tipoUnidade;
	
	public UnidadeViewModel(Unidade unidade){
		this.codigoUnidade = unidade.getCodigoUnidade();
		this.descricaoUnidade = unidade.getNomeUnidade();
		this.descricaoEndereco = unidade.getDescricaoEndereco();
		this.cep = unidade.getCep();
		this.numeroTelefone1 = unidade.getNumeroTelefone1();
		this.numeroTelefone2 = unidade.getNumeroTelefone2();
		this.bairro = unidade.getBairro();
		this.tipoUnidade = unidade.getTipoUnidade();
	}
	
	public UnidadeViewModel(){
		
	}
	
	public String getDescricaoEndereco() {
		return descricaoEndereco;
	}

	public void setDescricaoEndereco(String descricaoEndereco) {
		this.descricaoEndereco = descricaoEndereco;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public Long getNumeroTelefone1() {
		return numeroTelefone1;
	}

	public void setNumeroTelefone1(Long numeroTelefone1) {
		this.numeroTelefone1 = numeroTelefone1;
	}

	public Long getNumeroTelefone2() {
		return numeroTelefone2;
	}

	public void setNumeroTelefone2(Long numeroTelefone2) {
		this.numeroTelefone2 = numeroTelefone2;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public TipoUnidade getTipoUnidade() {
		return tipoUnidade;
	}

	public void setTipoUnidade(TipoUnidade tipoUnidade) {
		this.tipoUnidade = tipoUnidade;
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

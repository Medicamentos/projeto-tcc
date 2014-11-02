package br.com.medicamento.insumo.viewmodel;

public class TipoControleViewModel {

	private Integer codigoTipoControle;
    private String descricaoTipoControle;
    
	public TipoControleViewModel(Integer codigoTipoControle,String descricaoTipoControle) {
		this.codigoTipoControle = codigoTipoControle;
		this.descricaoTipoControle = descricaoTipoControle;
	}
	public Integer getCodigoTipoControle() {
		return codigoTipoControle;
	}
	public void setCodigoTipoControle(Integer codigoTipoControle) {
		this.codigoTipoControle = codigoTipoControle;
	}
	public String getDescricaoTipoControle() {
		return descricaoTipoControle;
	}
	public void setDescricaoTipoControle(String descricaoTipoControle) {
		this.descricaoTipoControle = descricaoTipoControle;
	}
}

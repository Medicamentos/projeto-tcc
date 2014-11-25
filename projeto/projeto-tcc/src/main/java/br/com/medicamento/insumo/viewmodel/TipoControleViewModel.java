package br.com.medicamento.insumo.viewmodel;

public class TipoControleViewModel {

	private Long codigoTipoControle;
    private String descricaoTipoControle;
    
    public TipoControleViewModel() {
		
	}
    
	public TipoControleViewModel(Long codigoTipoControle, String descricaoTipoControle) {
		this.codigoTipoControle = codigoTipoControle;
		this.descricaoTipoControle = descricaoTipoControle;
	}
	
	public Long getCodigoTipoControle() {
		return codigoTipoControle;
	}
	public void setCodigoTipoControle(Long codigoTipoControle) {
		this.codigoTipoControle = codigoTipoControle;
	}
	public String getDescricaoTipoControle() {
		return descricaoTipoControle;
	}
	public void setDescricaoTipoControle(String descricaoTipoControle) {
		this.descricaoTipoControle = descricaoTipoControle;
	}
    
	
}

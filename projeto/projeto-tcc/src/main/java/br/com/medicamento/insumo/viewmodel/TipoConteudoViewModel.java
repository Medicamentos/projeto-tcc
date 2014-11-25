package br.com.medicamento.insumo.viewmodel;

public class TipoConteudoViewModel {

	private Integer codigoTipoConteudo;
    private String descricaoTipoConteudo;
    
    
    public TipoConteudoViewModel() {
	
	}
    
	public TipoConteudoViewModel(Integer codigoTipoConteudo,String descricaoTipoConteudo) {
		this.codigoTipoConteudo = codigoTipoConteudo;
		this.descricaoTipoConteudo = descricaoTipoConteudo;
	}
	
	public Integer getCodigoTipoConteudo() {
		return codigoTipoConteudo;
	}
	
	public void setCodigoTipoConteudo(Integer codigoTipoConteudo) {
		this.codigoTipoConteudo = codigoTipoConteudo;
	}
	
	public String getDescricaoTipoConteudo() {
		return descricaoTipoConteudo;
	}
	
	public void setDescricaoTipoConteudo(String descricaoTipoConteudo) {
		this.descricaoTipoConteudo = descricaoTipoConteudo;
	}
    
    

}

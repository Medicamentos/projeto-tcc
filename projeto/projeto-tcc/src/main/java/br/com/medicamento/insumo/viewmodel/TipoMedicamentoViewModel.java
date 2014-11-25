package br.com.medicamento.insumo.viewmodel;

public class TipoMedicamentoViewModel {
	
	private Long codigoTipoMedicamento;
    private String descricaoTipoMedicamento;
    
    public TipoMedicamentoViewModel() {
	}
    
    
	public TipoMedicamentoViewModel(Long codigoTipoMedicamento, String descricaoTipoMedicamento) {
		this.codigoTipoMedicamento = codigoTipoMedicamento;
		this.descricaoTipoMedicamento = descricaoTipoMedicamento;
	}
	
	public Long getCodigoTipoMedicamento() {
		return codigoTipoMedicamento;
	}
	
	public void setCodigoTipoMedicamento(Long codigoTipoMedicamento) {
		this.codigoTipoMedicamento = codigoTipoMedicamento;
	}
	
	public String getDescricaoTipoMedicamento() {
		return descricaoTipoMedicamento;
	}
	
	public void setDescricaoTipoMedicamento(String descricaoTipoMedicamento) {
		this.descricaoTipoMedicamento = descricaoTipoMedicamento;
	}
    

    
}

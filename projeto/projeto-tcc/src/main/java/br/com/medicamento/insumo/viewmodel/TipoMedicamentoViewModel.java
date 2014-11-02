package br.com.medicamento.insumo.viewmodel;

public class TipoMedicamentoViewModel {
	
	private Integer codigoTipoMedicamento;
    private String descricaoTipoMedicamento;
    
	public TipoMedicamentoViewModel(Integer codigoTipoMedicamento, String descricaoTipoMedicamento) {
		this.codigoTipoMedicamento = codigoTipoMedicamento;
		this.descricaoTipoMedicamento = descricaoTipoMedicamento;
	}
	public Integer getCodigoTipoMedicamento() {
		return codigoTipoMedicamento;
	}
	public void setCodigoTipoMedicamento(Integer codigoTipoMedicamento) {
		this.codigoTipoMedicamento = codigoTipoMedicamento;
	}
	public String getDescricaoTipoMedicamento() {
		return descricaoTipoMedicamento;
	}
	public void setDescricaoTipoMedicamento(String descricaoTipoMedicamento) {
		this.descricaoTipoMedicamento = descricaoTipoMedicamento;
	}
}

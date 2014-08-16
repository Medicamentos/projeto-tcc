package br.com.medicamento.insumo.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="nota_fiscal")
public class NotaFiscal {
	
	@Id
	@GeneratedValue
    private Integer codigoNumeroNota;
    private Date dataEmissao;
    private Long valorTotalNota;
    
	public Integer getCodigoNumeroNota() {
		return codigoNumeroNota;
	}
	public void setCodigoNumeroNota(Integer codigoNumeroNota) {
		this.codigoNumeroNota = codigoNumeroNota;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public Long getValorTotalNota() {
		return valorTotalNota;
	}
	public void setValorTotalNota(Long valorTotalNota) {
		this.valorTotalNota = valorTotalNota;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((codigoNumeroNota == null) ? 0 : codigoNumeroNota.hashCode());
		result = prime * result
				+ ((dataEmissao == null) ? 0 : dataEmissao.hashCode());
		result = prime * result
				+ ((valorTotalNota == null) ? 0 : valorTotalNota.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotaFiscal other = (NotaFiscal) obj;
		if (codigoNumeroNota == null) {
			if (other.codigoNumeroNota != null)
				return false;
		} else if (!codigoNumeroNota.equals(other.codigoNumeroNota))
			return false;
		if (dataEmissao == null) {
			if (other.dataEmissao != null)
				return false;
		} else if (!dataEmissao.equals(other.dataEmissao))
			return false;
		if (valorTotalNota == null) {
			if (other.valorTotalNota != null)
				return false;
		} else if (!valorTotalNota.equals(other.valorTotalNota))
			return false;
		return true;
	}
    
    
}

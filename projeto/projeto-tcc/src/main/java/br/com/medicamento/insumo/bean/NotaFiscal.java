package br.com.medicamento.insumo.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="notaFiscal")
public class NotaFiscal {
	
	@Id
	@GeneratedValue
    private Integer codigoNotaFiscal;
	private Integer numeroNotaFiscal;
    private Date dataEmissao;
    private Long valor;
    
	public Integer getCodigoNotaFiscal() {
		return codigoNotaFiscal;
	}
	public void setCodigoNotaFiscal(Integer codigoNotaFiscal) {
		this.codigoNotaFiscal = codigoNotaFiscal;
	}
	public Integer getNumeroNotaFiscal() {
		return numeroNotaFiscal;
	}
	public void setNumeroNotaFiscal(Integer numeroNotaFiscal) {
		this.numeroNotaFiscal = numeroNotaFiscal;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public Long getValor() {
		return valor;
	}
	public void setValor(Long valor) {
		this.valor = valor;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((codigoNotaFiscal == null) ? 0 : codigoNotaFiscal.hashCode());
		result = prime * result
				+ ((dataEmissao == null) ? 0 : dataEmissao.hashCode());
		result = prime
				* result
				+ ((numeroNotaFiscal == null) ? 0 : numeroNotaFiscal.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
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
		if (codigoNotaFiscal == null) {
			if (other.codigoNotaFiscal != null)
				return false;
		} else if (!codigoNotaFiscal.equals(other.codigoNotaFiscal))
			return false;
		if (dataEmissao == null) {
			if (other.dataEmissao != null)
				return false;
		} else if (!dataEmissao.equals(other.dataEmissao))
			return false;
		if (numeroNotaFiscal == null) {
			if (other.numeroNotaFiscal != null)
				return false;
		} else if (!numeroNotaFiscal.equals(other.numeroNotaFiscal))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}
    
	 
}

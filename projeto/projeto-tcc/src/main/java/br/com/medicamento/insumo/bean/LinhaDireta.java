package br.com.medicamento.insumo.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="linha_direta")
public class LinhaDireta  {
	
	
	@Id
	@GeneratedValue
    private Integer codigoLinhaDireta;
	@ManyToOne
	@JoinColumn(name="codigoUnidade")
    private Unidade unidade;
    private String  assunto;
    private String  mensagem;
    
	public Integer getCodigoLinhaDireta() {
		return codigoLinhaDireta;
	}
	public void setCodigoLinhaDireta(Integer codigoLinhaDireta) {
		this.codigoLinhaDireta = codigoLinhaDireta;
	}
	public Unidade getUnidade() {
		return unidade;
	}
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assunto == null) ? 0 : assunto.hashCode());
		result = prime
				* result
				+ ((codigoLinhaDireta == null) ? 0 : codigoLinhaDireta
						.hashCode());
		result = prime * result
				+ ((mensagem == null) ? 0 : mensagem.hashCode());
		result = prime * result + ((unidade == null) ? 0 : unidade.hashCode());
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
		LinhaDireta other = (LinhaDireta) obj;
		if (assunto == null) {
			if (other.assunto != null)
				return false;
		} else if (!assunto.equals(other.assunto))
			return false;
		if (codigoLinhaDireta == null) {
			if (other.codigoLinhaDireta != null)
				return false;
		} else if (!codigoLinhaDireta.equals(other.codigoLinhaDireta))
			return false;
		if (mensagem == null) {
			if (other.mensagem != null)
				return false;
		} else if (!mensagem.equals(other.mensagem))
			return false;
		if (unidade == null) {
			if (other.unidade != null)
				return false;
		} else if (!unidade.equals(other.unidade))
			return false;
		return true;
	}
	
	

}

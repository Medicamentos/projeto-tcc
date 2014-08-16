package br.com.medicamento.insumo.bean;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="pedido")
public class Pedido {

	@Id
	@GeneratedValue
	private Long codigoPedido;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataPedido;
	@JoinColumn(name="codigoUnidade")
    private Unidade unidade;
    private Boolean aprovado;
    
	public Long getCodigoPedido() {
		return codigoPedido;
	}
	public void setCodigoPedido(Long codigoPedido) {
		this.codigoPedido = codigoPedido;
	}
	public Calendar getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Calendar dataPedido) {
		this.dataPedido = dataPedido;
	}
	public Unidade getUnidade() {
		return unidade;
	}
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
	public Boolean getAprovado() {
		return aprovado;
	}
	public void setAprovado(Boolean aprovado) {
		this.aprovado = aprovado;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((aprovado == null) ? 0 : aprovado.hashCode());
		result = prime * result
				+ ((codigoPedido == null) ? 0 : codigoPedido.hashCode());
		result = prime * result
				+ ((dataPedido == null) ? 0 : dataPedido.hashCode());
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
		Pedido other = (Pedido) obj;
		if (aprovado == null) {
			if (other.aprovado != null)
				return false;
		} else if (!aprovado.equals(other.aprovado))
			return false;
		if (codigoPedido == null) {
			if (other.codigoPedido != null)
				return false;
		} else if (!codigoPedido.equals(other.codigoPedido))
			return false;
		if (dataPedido == null) {
			if (other.dataPedido != null)
				return false;
		} else if (!dataPedido.equals(other.dataPedido))
			return false;
		if (unidade == null) {
			if (other.unidade != null)
				return false;
		} else if (!unidade.equals(other.unidade))
			return false;
		return true;
	}
    
    
}

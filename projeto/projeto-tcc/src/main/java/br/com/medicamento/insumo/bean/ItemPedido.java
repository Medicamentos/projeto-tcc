package br.com.medicamento.insumo.bean;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="item_pedido")
public class ItemPedido {

	@Id
	@GeneratedValue
	private Long codigoItemPedido;
	@JoinColumn(name="codigoMaterial")
	private Material material;
	@JoinColumn(name="codigoPedido")
	private Pedido pedido;
	private long quantidadeItemPedido;
	private Boolean aprovado;
	
	public Long getCodigoItemPedido() {
		return codigoItemPedido;
	}
	public void setCodigoItemPedido(Long codigoItemPedido) {
		this.codigoItemPedido = codigoItemPedido;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public long getQuantidadeItemPedido() {
		return quantidadeItemPedido;
	}
	public void setQuantidadeItemPedido(long quantidadeItemPedido) {
		this.quantidadeItemPedido = quantidadeItemPedido;
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
		result = prime
				* result
				+ ((codigoItemPedido == null) ? 0 : codigoItemPedido.hashCode());
		result = prime * result
				+ ((material == null) ? 0 : material.hashCode());
		result = prime * result + ((pedido == null) ? 0 : pedido.hashCode());
		result = prime * result
				+ (int) (quantidadeItemPedido ^ (quantidadeItemPedido >>> 32));
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
		ItemPedido other = (ItemPedido) obj;
		if (aprovado == null) {
			if (other.aprovado != null)
				return false;
		} else if (!aprovado.equals(other.aprovado))
			return false;
		if (codigoItemPedido == null) {
			if (other.codigoItemPedido != null)
				return false;
		} else if (!codigoItemPedido.equals(other.codigoItemPedido))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (pedido == null) {
			if (other.pedido != null)
				return false;
		} else if (!pedido.equals(other.pedido))
			return false;
		if (quantidadeItemPedido != other.quantidadeItemPedido)
			return false;
		return true;
	}  
}

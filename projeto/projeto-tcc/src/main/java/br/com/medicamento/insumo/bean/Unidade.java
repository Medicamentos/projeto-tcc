package br.com.medicamento.insumo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="unidade")
public class Unidade {
	
		@Id
		@GeneratedValue
	    private Integer codigoUnidade;
	    private String nomeUnidade;
	    private String descricaoEndereco;
	    private Integer cep;
	    private Long numeroTelefone1;
	    private boolean status;
	    
	    @ManyToOne
	    @JoinColumn(name="codigoBairro")
	    private Bairro bairro;
	    @ManyToOne
	    @JoinColumn(name="codigoTipoUnidade")
	    private TipoUnidade tipoUnidade;
	    
		public Integer getCodigoUnidade() {
			return codigoUnidade;
		}
		public void setCodigoUnidade(Integer codigoUnidade) {
			this.codigoUnidade = codigoUnidade;
		}
		public String getNomeUnidade() {
			return nomeUnidade;
		}
		public void setNomeUnidade(String nomeUnidade) {
			this.nomeUnidade = nomeUnidade;
		}
		public String getDescricaoEndereco() {
			return descricaoEndereco;
		}
		public void setDescricaoEndereco(String descricaoEndereco) {
			this.descricaoEndereco = descricaoEndereco;
		}
		public Integer getCep() {
			return cep;
		}
		public void setCep(Integer cep) {
			this.cep = cep;
		}
		public Long getNumeroTelefone1() {
			return numeroTelefone1;
		}
		public void setNumeroTelefone1(Long numeroTelefone1) {
			this.numeroTelefone1 = numeroTelefone1;
		}
		public Bairro getBairro() {
			return bairro;
		}
		public void setBairro(Bairro bairro) {
			this.bairro = bairro;
		}
		public TipoUnidade getTipoUnidade() {
			return tipoUnidade;
		}
		public void setTipoUnidade(TipoUnidade tipoUnidade) {
			this.tipoUnidade = tipoUnidade;
		}
		
		public boolean isStatus() {
			return status;
		}
		
		public void setStatus(boolean status) {
			this.status = status;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((bairro == null) ? 0 : bairro.hashCode());
			result = prime * result + ((cep == null) ? 0 : cep.hashCode());
			result = prime * result
					+ ((codigoUnidade == null) ? 0 : codigoUnidade.hashCode());
			result = prime
					* result
					+ ((descricaoEndereco == null) ? 0 : descricaoEndereco
							.hashCode());
			result = prime * result
					+ ((nomeUnidade == null) ? 0 : nomeUnidade.hashCode());
			result = prime
					* result
					+ ((numeroTelefone1 == null) ? 0 : numeroTelefone1
							.hashCode());
			result = prime * result + (status ? 1231 : 1237);
			result = prime * result
					+ ((tipoUnidade == null) ? 0 : tipoUnidade.hashCode());
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
			Unidade other = (Unidade) obj;
			if (bairro == null) {
				if (other.bairro != null)
					return false;
			} else if (!bairro.equals(other.bairro))
				return false;
			if (cep == null) {
				if (other.cep != null)
					return false;
			} else if (!cep.equals(other.cep))
				return false;
			if (codigoUnidade == null) {
				if (other.codigoUnidade != null)
					return false;
			} else if (!codigoUnidade.equals(other.codigoUnidade))
				return false;
			if (descricaoEndereco == null) {
				if (other.descricaoEndereco != null)
					return false;
			} else if (!descricaoEndereco.equals(other.descricaoEndereco))
				return false;
			if (nomeUnidade == null) {
				if (other.nomeUnidade != null)
					return false;
			} else if (!nomeUnidade.equals(other.nomeUnidade))
				return false;
			if (numeroTelefone1 == null) {
				if (other.numeroTelefone1 != null)
					return false;
			} else if (!numeroTelefone1.equals(other.numeroTelefone1))
				return false;
			if (status != other.status)
				return false;
			if (tipoUnidade == null) {
				if (other.tipoUnidade != null)
					return false;
			} else if (!tipoUnidade.equals(other.tipoUnidade))
				return false;
			return true;
		}
	    
}

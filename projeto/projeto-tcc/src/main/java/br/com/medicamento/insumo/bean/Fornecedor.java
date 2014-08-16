package br.com.medicamento.insumo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="fornecedor")
public class Fornecedor {
	
	@Id
	@GeneratedValue
	private Integer codigoFornecedor;
    private Integer cnpj;
    private String nomeFornecedor;
    private Long numeroTelefone1;
    private Long numeroTelefone2;
    
	public Integer getCodigoFornecedor() {
		return codigoFornecedor;
	}
	public void setCodigoFornecedor(Integer codigoFornecedor) {
		this.codigoFornecedor = codigoFornecedor;
	}
	public Integer getCnpj() {
		return cnpj;
	}
	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomeFornecedor() {
		return nomeFornecedor;
	}
	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}
	public Long getNumeroTelefone1() {
		return numeroTelefone1;
	}
	public void setNumeroTelefone1(Long numeroTelefone1) {
		this.numeroTelefone1 = numeroTelefone1;
	}
	public Long getNumeroTelefone2() {
		return numeroTelefone2;
	}
	public void setNumeroTelefone2(Long numeroTelefone2) {
		this.numeroTelefone2 = numeroTelefone2;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime
				* result
				+ ((codigoFornecedor == null) ? 0 : codigoFornecedor.hashCode());
		result = prime * result
				+ ((nomeFornecedor == null) ? 0 : nomeFornecedor.hashCode());
		result = prime * result
				+ ((numeroTelefone1 == null) ? 0 : numeroTelefone1.hashCode());
		result = prime * result
				+ ((numeroTelefone2 == null) ? 0 : numeroTelefone2.hashCode());
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
		Fornecedor other = (Fornecedor) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (codigoFornecedor == null) {
			if (other.codigoFornecedor != null)
				return false;
		} else if (!codigoFornecedor.equals(other.codigoFornecedor))
			return false;
		if (nomeFornecedor == null) {
			if (other.nomeFornecedor != null)
				return false;
		} else if (!nomeFornecedor.equals(other.nomeFornecedor))
			return false;
		if (numeroTelefone1 == null) {
			if (other.numeroTelefone1 != null)
				return false;
		} else if (!numeroTelefone1.equals(other.numeroTelefone1))
			return false;
		if (numeroTelefone2 == null) {
			if (other.numeroTelefone2 != null)
				return false;
		} else if (!numeroTelefone2.equals(other.numeroTelefone2))
			return false;
		return true;
	}
    
    

}

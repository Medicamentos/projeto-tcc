package br.com.medicamento.insumo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.medicamento.insumo.bean.TipoUnidade;

@Transactional
@Repository
public class TipoUnidadeDAO {
	
	@PersistenceContext
	EntityManager em;
	
	public Integer salvar(TipoUnidade tipoUnidade) {
		em.persist(tipoUnidade);
		em.flush();
		em.refresh(tipoUnidade);
		return tipoUnidade.getCodigoTipoUnidade();
	}

	public void atualizar(TipoUnidade tipoUnidade) {
		em.merge(tipoUnidade);
	}

	public void deletar(TipoUnidade tipoUnidade) {
		em.remove(tipoUnidade);
	}

	public TipoUnidade buscarPorId(Long id) {
		return em.find(TipoUnidade.class, id.intValue());
	}
	
	@SuppressWarnings("unchecked")
	public List<TipoUnidade> buscarTodos() {
		List<TipoUnidade> tipoUnidade = em.createQuery("SELECT c FROM tipo_unidade c").getResultList();
		return tipoUnidade;
	}

}

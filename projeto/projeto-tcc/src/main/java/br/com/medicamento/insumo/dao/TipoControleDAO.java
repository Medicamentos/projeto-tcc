package br.com.medicamento.insumo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.medicamento.insumo.bean.TipoControle;

@Transactional
@Repository
public class TipoControleDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public Long salvar(TipoControle tipoControle) {
		em.persist(tipoControle);
		em.flush();
		em.refresh(tipoControle);
		return tipoControle.getCodigoTipoControle();
	}

	public void atualizar(TipoControle tipoControle) {
		em.merge(tipoControle);
	}

	public void deletar(TipoControle tipoControle) {
		em.remove(tipoControle);
	}

	public TipoControle buscarPorId(Long id) {
		return em.find(TipoControle.class, id.intValue());
	}
	
	@SuppressWarnings("unchecked")
	public List<TipoControle> buscarTodos() {
		List<TipoControle> listaTipoControle = em.createQuery("SELECT t FROM tipo_controle t").getResultList();
		return listaTipoControle;
	}

}

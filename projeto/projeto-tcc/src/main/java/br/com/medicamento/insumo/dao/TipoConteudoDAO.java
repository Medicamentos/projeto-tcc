package br.com.medicamento.insumo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.medicamento.insumo.bean.TipoConteudo;

@Transactional
@Repository
public class TipoConteudoDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public Long salvar(TipoConteudo tipoConteudo) {
		em.persist(tipoConteudo);
		em.flush();
		em.refresh(tipoConteudo);
		return tipoConteudo.getCodigoTipoConteudo();
	}

	public void atualizar(TipoConteudo tipoConteudo) {
		em.merge(tipoConteudo);
	}

	public void deletar(TipoConteudo tipoConteudo) {
		em.remove(tipoConteudo);
	}

	public TipoConteudo buscarPorId(Long id) {
		return em.find(TipoConteudo.class, id.intValue());
	}
	
	@SuppressWarnings("unchecked")
	public List<TipoConteudo> buscarTodos() {
		List<TipoConteudo> listaTipoConteudo = em.createQuery("SELECT t FROM tipo_conteudo t").getResultList();
		return listaTipoConteudo;
	}

}
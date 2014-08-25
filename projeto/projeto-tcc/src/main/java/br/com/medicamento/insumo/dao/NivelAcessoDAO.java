package br.com.medicamento.insumo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.medicamento.insumo.bean.NivelAcesso;

@Transactional
@Repository
public class NivelAcessoDAO {

	@PersistenceContext
	EntityManager em;

	public void salvar(NivelAcesso nivelAcesso) {
		em.persist(nivelAcesso);
	}

	public void atualizar(NivelAcesso nivelAcesso) {
		em.merge(nivelAcesso);
	}

	public void deletar(NivelAcesso nivelAcesso) {
		em.remove(nivelAcesso);
	}

	public NivelAcesso buscarPorId(Long id) {
		return em.find(NivelAcesso.class, id.intValue());
	}
	
	@SuppressWarnings("unchecked")
	public List<NivelAcesso> buscarTodos() {
		List<NivelAcesso> listaNivelAcesso = em.createQuery("SELECT c FROM nivel_acesso c").getResultList();
		return listaNivelAcesso;
	}
	
}

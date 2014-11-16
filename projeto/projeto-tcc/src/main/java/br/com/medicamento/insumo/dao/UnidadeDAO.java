package br.com.medicamento.insumo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.medicamento.insumo.bean.Unidade;

@Transactional
@Repository
public class UnidadeDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void salvar(Unidade unidade){
		em.persist(unidade);
	}
	
	public void atualizar(Unidade unidade){
		em.merge(unidade);
	}
	
	public void deletar(Unidade unidade) {
		em.remove(unidade);
	}
	
	public Unidade buscarPorId(Long id) {
		return em.find(Unidade.class, id.intValue());
	}
	
	@SuppressWarnings("unchecked")
	public List<Unidade> buscarTodos(){
		List<Unidade> listaUnidades = em.createQuery("SELECT u FROM unidade u").getResultList();
		return listaUnidades;
	}

	@SuppressWarnings("unchecked")
	public List<Unidade> buscarUnidadesAtivas(){
		List<Unidade> listaUnidadesAtivas = em.createQuery("SELECT u FROM unidade u where status = 1").getResultList();
		return listaUnidadesAtivas;
	}
}

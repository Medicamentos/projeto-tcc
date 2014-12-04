package br.com.medicamento.insumo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.medicamento.insumo.bean.Laboratorio;

@Transactional
@Repository
public class LaboratorioDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void salvar(Laboratorio laboratorio) {
		em.persist(laboratorio);
	
	}

	public void atualizar(Laboratorio laboratorio) {
		em.merge(laboratorio);
	}

	public void deletar(Laboratorio laboratorio) {
		em.remove(laboratorio);
	}

	public Laboratorio buscarPorId(Long id) {
		return em.find(Laboratorio.class, id.intValue());
	}
	
	@SuppressWarnings("unchecked")
	public List<Laboratorio> buscarTodos() {
		List<Laboratorio> listaLaboratorio = em.createQuery("SELECT l FROM laboratorio l").getResultList();
		return listaLaboratorio;
	}


}

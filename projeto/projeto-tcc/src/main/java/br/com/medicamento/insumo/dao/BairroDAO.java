package br.com.medicamento.insumo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.medicamento.insumo.bean.Bairro;

@Transactional
@Repository
public class BairroDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public Integer salvar(Bairro bairro) {
		em.persist(bairro);
		em.flush();
		em.refresh(bairro);
		return bairro.getCodigoBairro();
	}

	public void atualizar(Bairro bairro) {
		em.merge(bairro);
	}

	public void deletar(Bairro bairro) {
		em.remove(bairro);
	}

	public Bairro buscarPorId(Long id) {
		return em.find(Bairro.class, id.intValue());
	}
	
	@SuppressWarnings("unchecked")
	public List<Bairro> buscarTodos() {
		List<Bairro> listaBairro = em.createQuery("SELECT c FROM bairro c").getResultList();
		return listaBairro;
	}

}

package br.com.medicamento.insumo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.medicamento.insumo.bean.Cargo;

@Transactional
@Repository
public class CargoDAO {

	@PersistenceContext
	private EntityManager em;
	
	public Integer salvar(Cargo cargo) {
		em.persist(cargo);
		em.flush();;
		em.refresh(cargo);
		return cargo.getCodigoCargo();
	}

	public void atualizar(Cargo cargo) {
		em.merge(cargo);
	}

	public void deletar(Cargo cargo) {
		em.remove(cargo);
	}

	public Cargo buscarPorId(Long id) {
		return em.find(Cargo.class, id.intValue());
	}
	
	@SuppressWarnings("unchecked")
	public List<Cargo> buscarTodos() {
		List<Cargo> listaCargo = em.createQuery("SELECT c FROM cargo c").getResultList();
		return listaCargo;
	}
	
}

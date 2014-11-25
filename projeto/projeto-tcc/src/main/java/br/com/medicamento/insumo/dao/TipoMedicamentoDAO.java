package br.com.medicamento.insumo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.medicamento.insumo.bean.TipoMedicamento;

@Transactional
@Repository
public class TipoMedicamentoDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public Long salvar(TipoMedicamento tipoMedicamento) {
		em.persist(tipoMedicamento);
		em.flush();
		em.refresh(tipoMedicamento);
		return tipoMedicamento.getCodigoTipoMedicamento();
	}

	public void atualizar(TipoMedicamento tipoMedicamento) {
		em.merge(tipoMedicamento);
	}

	public void deletar(TipoMedicamento tipoMedicamento) {
		em.remove(tipoMedicamento);
	}

	public TipoMedicamento buscarPorId(Long id) {
		return em.find(TipoMedicamento.class, id.intValue());
	}
	
	@SuppressWarnings("unchecked")
	public List<TipoMedicamento> buscarTodos() {
		List<TipoMedicamento> listaTipoMedicamento = em.createQuery("SELECT t FROM tipo_medicamento t").getResultList();
		return listaTipoMedicamento;
	}

}

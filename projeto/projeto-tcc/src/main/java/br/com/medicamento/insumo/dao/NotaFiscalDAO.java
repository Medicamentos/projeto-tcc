package br.com.medicamento.insumo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.medicamento.insumo.bean.NotaFiscal;

@Transactional
@Repository
public class NotaFiscalDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public Integer salvar(NotaFiscal notaFical) {
		em.persist(notaFical);
		em.flush();
		em.refresh(notaFical);
		return notaFical.getCodigoNumeroNota();
	}

	public void atualizar(NotaFiscal notaFical) {
		em.merge(notaFical);
	}

	public void deletar(NotaFiscal notaFical) {
		em.remove(notaFical);
	}

	public NotaFiscal buscarPorId(Long id) {
		return em.find(NotaFiscal.class, id.intValue());
	}
	
	@SuppressWarnings("unchecked")
	public List<NotaFiscal> buscarTodos() {
		List<NotaFiscal> listaNotaFiscal = em.createQuery("SELECT n FROM nota_fiscal n").getResultList();
		return listaNotaFiscal;
	}

}

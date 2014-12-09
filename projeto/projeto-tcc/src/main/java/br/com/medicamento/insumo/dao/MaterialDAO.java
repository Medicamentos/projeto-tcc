package br.com.medicamento.insumo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.medicamento.insumo.bean.Material;

@Transactional
@Repository
public class MaterialDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public Long salvar(Material material) {
		em.persist(material);
		em.flush();
		em.refresh(material);
		return material.getCodigoMaterial();
	}

	public void atualizar(Material material) {
		em.merge(material);
	}

	public void deletar(Material material) {
		em.remove(material);
	}

	public Material buscarPorId(Long id) {
		return em.find(Material.class, id.intValue());
	}
	
/*	@SuppressWarnings("unchecked")
	public List<Material> buscarTodosPorNotaFiscal(Integer id) {
		NotaFiscal notaFiscal = em.find(NotaFiscal.class, id);
		List<Material> listaMaterial = em.createQuery("SELECT m FROM material m where codigoNotaFiscal ="+ notaFiscal.getCodigoNotaFiscal()).getResultList();
		return listaMaterial;
	}*/

	
	@SuppressWarnings("unchecked")
	public List<Material> buscarTodos() {
		List<Material> listaMaterial = em.createQuery("SELECT m FROM material m").getResultList();
		return listaMaterial;
	}

}

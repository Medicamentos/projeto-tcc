package br.com.medicamento.insumo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.medicamento.insumo.bean.ItemMaterial;

@Transactional
@Repository
public class ItemMaterialDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void salvar(ItemMaterial itemMaterial) {
		em.persist(itemMaterial);
	}

	public void atualizar(ItemMaterial itemMaterial) {
		em.merge(itemMaterial);
	}

	public void deletar(ItemMaterial itemMaterial) {
		em.remove(itemMaterial);
	}

	public ItemMaterial buscarPorId(Long id) {
		return em.find(ItemMaterial.class, id.intValue());
	}
	
	@SuppressWarnings("unchecked")
	public List<ItemMaterial> buscarTodos() {
		List<ItemMaterial> listaItemMaterial = em.createQuery("SELECT m FROM item_material m").getResultList();
		return listaItemMaterial;
	}
}

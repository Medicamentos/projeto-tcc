package br.com.medicamento.insumo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.medicamento.insumo.bean.UsuarioSistema;

@Transactional
@Repository
public class UsuarioSistamaDAO{
	
	@PersistenceContext
	EntityManager em;

	public void salvar(UsuarioSistema usuario) {
		em.persist(usuario);
	}

	public void atualizar(UsuarioSistema usuario) {
		em.merge(usuario);
	}

	public void deletar(UsuarioSistema usuario) {
		em.remove(usuario);
	}

	public UsuarioSistema buscarPorId(Long id) {
		UsuarioSistema usuario = em.find(UsuarioSistema.class, id);
		return usuario;
	}

	@SuppressWarnings("unchecked")
	public List<UsuarioSistema> buscarTodos() {
		List<UsuarioSistema> listaUsuario = em.createQuery("SELECT t FROM usuario_sistema").getResultList();
		return listaUsuario;
	}

	
}

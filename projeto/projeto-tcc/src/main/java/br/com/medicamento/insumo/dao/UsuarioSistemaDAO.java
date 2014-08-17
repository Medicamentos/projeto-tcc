package br.com.medicamento.insumo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.medicamento.insumo.bean.UsuarioSistema;

@Transactional
@Repository
public class UsuarioSistemaDAO{
	
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
		return em.find(UsuarioSistema.class, id.intValue());
	}
	
	@SuppressWarnings("unchecked")
	public List<UsuarioSistema> buscarTodos() {
		List<UsuarioSistema> listaUsuario = em.createQuery("SELECT c FROM usuario_sistema c").getResultList();
		return listaUsuario;
	}

	public UsuarioSistema buscarPorLogin(String login){
		Query query = em.createQuery("SELECT c FROM usuario_sistema c WHERE c.loginUsuarioSistema=:login");
		query.setParameter("login", login);
		return (UsuarioSistema)query.getSingleResult();
	}
	
	
}

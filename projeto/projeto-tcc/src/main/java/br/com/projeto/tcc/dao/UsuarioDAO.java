package br.com.projeto.tcc.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.projeto.tcc.bean.UsuarioBO;

@Repository
public class UsuarioDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void salvar(UsuarioBO usuario){
		em.joinTransaction();
		em.persist(usuario);
	}

}

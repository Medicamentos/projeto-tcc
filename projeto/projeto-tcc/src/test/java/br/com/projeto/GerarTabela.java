package br.com.projeto;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

public class GerarTabela {
	
	@Test
	public void test() {
		
		try{
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("projeto-tcc");
			factory.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}

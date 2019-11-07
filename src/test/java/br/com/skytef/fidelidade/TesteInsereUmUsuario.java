package br.com.skytef.fidelidade;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.skytef.fidelidade.model.User;
import br.com.skytef.fidelidade.repository.JPAUtil;

public class TesteInsereUmUsuario {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		User u = new User ();
		u.setName("Ana");
		u.setPassword("ana123");
		manager.persist(u);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}

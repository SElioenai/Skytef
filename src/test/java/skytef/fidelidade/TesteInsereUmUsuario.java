package skytef.fidelidade;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import skytef.fidelidade.repository.JPAUtil;
import skytef.fidelidade.model.User;

public class TesteInsereUmUsuario {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		User u = new User ();
		u.setName("Stevan");
		u.setPassword("1234");
		manager.persist(u);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}

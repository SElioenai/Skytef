package skytef.fidelidade.dao;

import javax.persistence.EntityManager;

import skytef.fidelidade.model.User;

public class UserDAO {

	EntityManager manager;
	public UserDAO(EntityManager manager){
		this.manager = manager;

	}
	public void criar(User user){
		manager.persist(user);
	}
	public void atualizar(User user){
		manager.merge(user);
	}
	public void remover(User user){
		manager.remove(user);
	}
}


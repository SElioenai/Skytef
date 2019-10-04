package skytef.fidelidade.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import skytef.fidelidade.model.User;

public class UserDAO {
	@PersistenceContext
	EntityManager manager;
	public UserDAO(EntityManager manager){
		this.manager = manager;

	}
	public void create(User user){
		manager.persist(user);
	}
	public void update(User user){
		manager.merge(user);
	}
	public void delete(User user){
		manager.remove(user);
	}
	public User select(int id){
		return manager.find(User.class, id);
	}
}

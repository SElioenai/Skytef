package skytef.fidelidade.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import skytef.fidelidade.model.Client;

public class ClientDAO {
	@PersistenceContext
	EntityManager manager;
	public ClientDAO(EntityManager manager){
		this.manager = manager;

	}
	public void create(Client client){
		manager.persist(client);
	}
	public void update(Client client){
		manager.merge(client);
	}
	public void delete(Client client){
		manager.remove(client);
	}
	public Client select(int id){
		return manager.find(Client.class, id);
	}
}

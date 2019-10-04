package skytef.fidelidade.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import skytef.fidelidade.model.SoftwareHouse;


public class SoftwareHouseDAO {
	@PersistenceContext
	EntityManager manager;
	public SoftwareHouseDAO(EntityManager manager){
		this.manager = manager;

	}
	public void create(SoftwareHouse sh){
		manager.persist(sh);
	}
	public void update(SoftwareHouse sh){
		manager.merge(sh);
	}
	public void delete(SoftwareHouse sh){
		manager.remove(sh);
	}
	public SoftwareHouse select(int id){
		return manager.find(SoftwareHouse.class, id);
	}

}

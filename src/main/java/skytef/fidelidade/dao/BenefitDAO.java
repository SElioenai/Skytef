package skytef.fidelidade.dao;


import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import skytef.fidelidade.model.Benefit;

public class BenefitDAO {

	@PersistenceContext
	EntityManager manager;
	public BenefitDAO(EntityManager manager){
		this.manager = manager;
	}
	public void create(Benefit benefit){
		manager.persist(benefit);
	}
	public void update(Benefit benefit){
		manager.merge(benefit);
	}
	public void delete(Benefit benefit){
		manager.remove(benefit);
	}
	public Benefit select(int id){
		return manager.find(Benefit.class, id);
	}
	@SuppressWarnings("unchecked")
	public Collection<Benefit> selectAll(){
		return manager.createQuery("select * from benefit").getResultList();
	}
}

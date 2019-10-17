package skytef.fidelidade.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import skytef.fidelidade.model.PartnerCompany;

public class PartnerCompanyDAO {

	@PersistenceContext
	EntityManager manager;
	public PartnerCompanyDAO(EntityManager manager){
		this.manager = manager;

	}
	public void create(PartnerCompany pc){
		manager.persist(pc);
	}
	public void update(PartnerCompany pc){
		manager.merge(pc);
	}
	public void delete(PartnerCompany pc){
		manager.remove(pc);
	}
	public PartnerCompany select(int id){
		return manager.find(PartnerCompany.class, id);
	}
}

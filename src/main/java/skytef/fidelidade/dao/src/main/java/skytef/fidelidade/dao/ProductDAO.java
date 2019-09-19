package skytef.fidelidade.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import skytef.fidelidade.model.Product;

public class ProductDAO {
	@PersistenceContext
	EntityManager manager;
	public ProductDAO(EntityManager manager){
		this.manager = manager;

	}
	public void create(Product product){
		manager.persist(product);
	}
	public void update(Product product){
		manager.merge(product);
	}
	public void delete(Product product){
		manager.remove(product);
	}
	public Product select(int id){
		return manager.find(Product.class, id);
	}
}

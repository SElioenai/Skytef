package skytef.fidelidade.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import skytef.fidelidade.model.Product;
import skytef.fidelidade.repository.JPAUtil;
import skytef.fidelidade.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public void addProduct(Product product) {
//		EntityManager manager = JPAUtil.getEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		    transaction.begin();
		     productRepository.save(product);
//		     transaction.commit();
//		     manager.persist(product);
//			 manager.close();
//			 JPAUtil.close();
//		 }
//		
	}
	public List<Product> listAll() {
		List<Product> product = (List<Product>) productRepository.findAll();
		return product;
	}

}

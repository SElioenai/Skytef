package skytef.fidelidade;

import org.springframework.beans.factory.annotation.Autowired;

import skytef.fidelidade.model.Product;
import skytef.fidelidade.repository.ProductRepository;
import skytef.fidelidade.service.ProductService;

public class TesteProduct {
	@Autowired
	private static ProductRepository service;

	public static void main(String[] args) {
		
		Product pdt = new Product();
		pdt.setProduct_id((long) 01);
		pdt.setProduct_description("Test");
		pdt.setProduct_price(1.2);
		service.save(pdt);
		
	}

}

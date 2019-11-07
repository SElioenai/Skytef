package br.com.skytef.fidelidade.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.skytef.fidelidade.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}

package br.com.skytef.fidelidade.repository;


import org.springframework.data.repository.CrudRepository;

import br.com.skytef.fidelidade.model.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {
	
}

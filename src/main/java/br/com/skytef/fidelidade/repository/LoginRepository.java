package br.com.skytef.fidelidade.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.skytef.fidelidade.model.User;

public interface LoginRepository extends CrudRepository<User, Long> {

}

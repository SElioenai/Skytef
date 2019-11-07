package br.com.skytef.fidelidade.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.skytef.fidelidade.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

	public static String findOneByLoginAndSenhaUser(String user, String password) {
		return user;
	}

}
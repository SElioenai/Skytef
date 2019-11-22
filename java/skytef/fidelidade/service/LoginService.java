package skytef.fidelidade.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import skytef.fidelidade.model.User;
import skytef.fidelidade.repository.UserRepository;;


@Service
public class LoginService {
	@Autowired
	UserRepository repo;
	
	public boolean logar(User user) {
		return repo.findOneByNameAndPassword(user.getName(),
				user.getPassword()) != null;
	}
}
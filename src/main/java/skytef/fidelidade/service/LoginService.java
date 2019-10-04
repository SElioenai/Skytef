package skytef.fidelidade.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import skytef.fidelidade.model.User;
import skytef.fidelidade.repository.UserRepository;;


@Service
public class LoginService {
	@Autowired
	UserRepository userRepo;
	
	public boolean logar(User usuario) {
		return UserRepository.findOneByLoginAndSenha(usuario.getName(),
				usuario.getPassword()) != null;
	}
}
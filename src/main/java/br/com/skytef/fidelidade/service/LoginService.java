package br.com.skytef.fidelidade.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.skytef.fidelidade.repository.UserRepository;
import br.com.skytef.fidelidade.model.User;;


@Service
public class LoginService {
	@Autowired
	UserRepository userRepo;
	
	public boolean logar(User usuario) {
		return UserRepository.findOneByLoginAndSenhaUser(usuario.getName(),
				usuario.getPassword()) != null;
	}
}
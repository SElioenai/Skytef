package skytef.fidelidade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import skytef.fidelidade.model.User;
import skytef.fidelidade.repository.UserRepository;

public class UserService {
	@Autowired
	private static UserRepository userRepo;
	
	public void saveUser(User user) {
		userRepo.saveAndFlush(user);
	}
	public static List<User> listAll() {
		List<User> user = userRepo.findAll();
		return user;
	}
	public void updateUser(User user) {
		userRepo.flush();
	}
	public void findAllUserbyId(User user) {
		userRepo.findAll();
	}
	public void findUserbyId(User user) {
		userRepo.findById(user.getUser_id());
	}
}

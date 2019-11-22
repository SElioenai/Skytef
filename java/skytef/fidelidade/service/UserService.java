package skytef.fidelidade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import skytef.fidelidade.model.User;
import skytef.fidelidade.repository.UserRepository;
@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	
	public void saveUser(User user) {
		userRepo.save(user);
	}
	public List<User> listAll() {
		List<User> user = (List<User>) userRepo.findAll();
		return user;
	}
	public void updateUser(User user) {
		userRepo.save(user);
	}
//	public void findAllUserbyId(User user) {
//		userRepo.findAll();
//	}
	public void findUserbyId(User user) {
		userRepo.findById(user.getUser_id());
	}
}

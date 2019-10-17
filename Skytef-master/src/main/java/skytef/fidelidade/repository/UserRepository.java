package skytef.fidelidade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import skytef.fidelidade.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	public static User findOneByLoginAndSenha(String user, String password) {
		// TODO Auto-generated method stub
		return null;
	}
}
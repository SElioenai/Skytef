package skytef.fidelidade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import skytef.fidelidade.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
//	@Query("select * from user where name = :name and password = :password;")
	public  User findOneByNameAndPassword(String name, String password);
}
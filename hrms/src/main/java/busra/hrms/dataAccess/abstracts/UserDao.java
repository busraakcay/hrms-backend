package busra.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import busra.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
	List<User> findByEmail(String email);
	List<User> findByPassword(String password);
	
	
//	User findByEmail(String email);
//	User findByPassword(String password);
}

package busra.hrms.business.abstracts;

import java.util.List;

import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.entities.concretes.User;

public interface UserService {
	
	Result signIn(String email, String password);
	
	DataResult<List<User>> getAll();
	Result userRegister(User user);
	boolean findByEmail(String email);
}

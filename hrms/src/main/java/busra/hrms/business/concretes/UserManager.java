package busra.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import busra.hrms.business.abstracts.UserService;
import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.ErrorResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.core.utilities.results.SuccessDataResult;
import busra.hrms.core.utilities.results.SuccessResult;
import busra.hrms.dataAccess.abstracts.UserDao;
import busra.hrms.entities.concretes.User;
import busra.hrms.verifications.abstracts.EmailVerificationService;

@Service
public class UserManager implements UserService{
	
	private UserDao userDao;
	private EmailVerificationService emailVerificationService;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Override
	public boolean findByEmail(String email) {
		if (this.userDao.findByEmail(email).contains(email)) {
			return false;
		}else {
			return true;
		}
	}
	
	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>
		(this.userDao.findAll(),"Users are listed.");
	}

	@Override
	public Result userRegister(User user) {
		if (findByEmail(user.getEmail())) {
			this.userDao.save(user);
			this.emailVerificationService.emailVerificate(user.getEmail());
			return new SuccessResult("User is added.");
		}else {
			return new ErrorResult("User is not added.");
		}
	}

	@Override
	public Result signIn(String email, String password) {
		Result login = new ErrorResult("Login unsuccessful !");
		for (int i = 0; i < userDao.findAll().size(); i++) {
			if (userDao.findAll().get(i).getEmail() == email
					&& userDao.findAll().get(i).getPassword() == password) {
				login = new SuccessResult("Login successful !");
			}
		}
		return login;
	}
}

package busra.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import busra.hrms.business.abstracts.VerificationService;
import busra.hrms.dataAccess.abstracts.VerificationDao;
import busra.hrms.entities.concretes.User;

@Service
public class VerificationManager implements VerificationService{
	
	private VerificationDao verificationDao;
	
	@Autowired
	public VerificationManager(VerificationDao verificationDao) {
		super();
		this.verificationDao = verificationDao;
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Override
	public boolean isValid(User user) {
		return this.verificationDao.equals(user);
	}

	
}

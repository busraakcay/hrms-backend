package busra.hrms.business.concretes;

import busra.hrms.business.abstracts.VerificationService;
import busra.hrms.entities.concretes.User;

public class VerificationManager implements VerificationService{

	@Override
	public boolean isValid(User user) {
		return true;
	}
	
}

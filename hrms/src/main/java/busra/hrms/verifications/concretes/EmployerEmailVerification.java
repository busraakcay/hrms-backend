package busra.hrms.verifications.concretes;

import busra.hrms.entities.concretes.User;
import busra.hrms.verifications.abstracts.EmailService;

public class EmployerEmailVerification implements EmailService {

	@Override
	public boolean emailVerificate(User user) {
		return true;
	}
	
}

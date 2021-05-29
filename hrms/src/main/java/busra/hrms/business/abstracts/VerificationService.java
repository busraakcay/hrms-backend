package busra.hrms.business.abstracts;

import busra.hrms.entities.concretes.User;

public interface VerificationService {
	boolean isValid(User user);
}

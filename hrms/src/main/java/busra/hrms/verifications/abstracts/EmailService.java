package busra.hrms.verifications.abstracts;

import busra.hrms.entities.concretes.User;

public interface EmailService {
	boolean emailVerificate(User user);
}

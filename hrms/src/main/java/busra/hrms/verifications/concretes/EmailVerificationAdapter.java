package busra.hrms.verifications.concretes;

import busra.hrms.verifications.abstracts.EmailVerificationService;

public class EmailVerificationAdapter implements EmailVerificationService {

	@Override
	public void emailVerificate(String email) {
		System.out.println("Check out your mails for verification");
	}
	
}

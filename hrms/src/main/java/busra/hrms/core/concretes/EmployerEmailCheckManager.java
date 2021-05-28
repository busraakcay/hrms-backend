package busra.hrms.core.concretes;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

import busra.hrms.core.abstracts.EmployerEmailCheckService;

@Component
public class EmployerEmailCheckManager implements EmployerEmailCheckService{
	
	//it will change according to employer conditions
	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";

	@Override
	public boolean checkEmail(String email) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
		return pattern.matcher(email).find();
	}

}

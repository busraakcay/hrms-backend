package busra.hrms.core.abstracts;

import org.springframework.stereotype.Service;

@Service
public interface EmployerEmailCheckService {
	boolean checkEmail(String email);
}

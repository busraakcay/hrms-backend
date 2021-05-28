package busra.hrms.core.abstracts;

import org.springframework.stereotype.Service;

@Service
public interface UnemployedEmailCheckService {
	boolean checkEmail(String email);
}

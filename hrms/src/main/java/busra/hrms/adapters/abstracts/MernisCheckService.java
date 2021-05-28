package busra.hrms.adapters.abstracts;

import org.springframework.stereotype.Service;

import busra.hrms.entities.concretes.Unemployed;

@Service
public interface MernisCheckService {
	boolean checkIfRealPerson(Unemployed unemployed);
}

package busra.hrms.adapters.abstracts;

import busra.hrms.entities.concretes.Unemployed;

public interface MernisCheckService {
	boolean checkIfRealPerson(Unemployed unemployed);
}

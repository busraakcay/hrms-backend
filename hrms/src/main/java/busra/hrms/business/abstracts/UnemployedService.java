package busra.hrms.business.abstracts;

import java.util.List;

import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.entities.concretes.Unemployed;

public interface UnemployedService {
	DataResult<List<Unemployed>> getAll();
	Result unemployedRegister(Unemployed unemployed);
	boolean findByNationalityId(String nationalityId);
}

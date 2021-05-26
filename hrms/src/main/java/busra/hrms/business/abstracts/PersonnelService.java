package busra.hrms.business.abstracts;

import java.util.List;

import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.entities.concretes.Personnel;

public interface PersonnelService {
	DataResult<List<Personnel>> getAll();
	Result add(Personnel personnel);
	
}

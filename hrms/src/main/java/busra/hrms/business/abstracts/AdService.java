package busra.hrms.business.abstracts;

import java.util.List;

import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.entities.concretes.Ad;

public interface AdService {
	DataResult<List<Ad>> getAll();
	DataResult<List<Ad>> getAllActive();
	Result add(Ad ad);
	
	DataResult<List<Ad>> getByStatusTrue();
	DataResult<List<Ad>> getByStatusTrueOrderByDeadline();
	DataResult<List<Ad>> getByStatusTrueAndEmployerId(int employerId);
	
	Result updateStatus(boolean status, int id);
}

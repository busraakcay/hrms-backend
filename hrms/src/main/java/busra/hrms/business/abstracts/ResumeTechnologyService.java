package busra.hrms.business.abstracts;

import java.util.List;

import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.entities.concretes.ResumeTechnology;

public interface ResumeTechnologyService {
	DataResult<List<ResumeTechnology>> getAll();
	Result add(ResumeTechnology resumeTechnology);
}

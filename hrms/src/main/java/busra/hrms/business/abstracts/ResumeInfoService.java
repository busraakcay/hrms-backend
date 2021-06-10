package busra.hrms.business.abstracts;

import java.util.List;

import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.entities.concretes.ResumeInfo;

public interface ResumeInfoService {
	DataResult<List<ResumeInfo>> getAll();
	Result add(ResumeInfo resumeInfo);
}

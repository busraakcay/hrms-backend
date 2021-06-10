package busra.hrms.business.abstracts;

import java.util.List;

import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.entities.concretes.ResumeExperience;

public interface ResumeExperienceService {
	DataResult<List<ResumeExperience>> getAll();
	Result add(ResumeExperience resumeExperience);
}

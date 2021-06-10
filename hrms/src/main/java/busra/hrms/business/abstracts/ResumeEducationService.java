package busra.hrms.business.abstracts;

import java.util.List;

import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.entities.concretes.ResumeEducation;

public interface ResumeEducationService {
	DataResult<List<ResumeEducation>> getAll();
	Result add(ResumeEducation resumeEducation);
}

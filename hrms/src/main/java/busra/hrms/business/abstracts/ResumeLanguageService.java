package busra.hrms.business.abstracts;

import java.util.List;

import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.entities.concretes.ResumeLanguage;

public interface ResumeLanguageService {
	DataResult<List<ResumeLanguage>> getAll();
	Result add(ResumeLanguage resumeLanguage);
}

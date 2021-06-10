package busra.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import busra.hrms.business.abstracts.ResumeLanguageService;
import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.core.utilities.results.SuccessDataResult;
import busra.hrms.core.utilities.results.SuccessResult;
import busra.hrms.dataAccess.abstracts.ResumeLanguageDao;
import busra.hrms.entities.concretes.ResumeLanguage;

@Service
public class ResumeLanguageManager implements ResumeLanguageService {
	
	private ResumeLanguageDao resumeLanguageDao;
	
	@Autowired
	public ResumeLanguageManager(ResumeLanguageDao resumeLanguageDao) {
		super();
		this.resumeLanguageDao = resumeLanguageDao;
	}

	@Override
	public DataResult<List<ResumeLanguage>> getAll() {
		return new SuccessDataResult<List<ResumeLanguage>>
		(this.resumeLanguageDao.findAll());
	}

	@Override
	public Result add(ResumeLanguage resumeLanguage) {
		this.resumeLanguageDao.save(resumeLanguage);
		return new SuccessResult();
	}

}

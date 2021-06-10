package busra.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import busra.hrms.business.abstracts.ResumeExperienceService;
import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.core.utilities.results.SuccessDataResult;
import busra.hrms.core.utilities.results.SuccessResult;
import busra.hrms.dataAccess.abstracts.ResumeExperienceDao;
import busra.hrms.entities.concretes.ResumeExperience;

@Service
public class ResumeExperienceManager implements ResumeExperienceService {
	
	private ResumeExperienceDao resumeExperienceDao;
	
	@Autowired
	public ResumeExperienceManager(ResumeExperienceDao resumeExperienceDao) {
		super();
		this.resumeExperienceDao = resumeExperienceDao;
	}

	@Override
	public DataResult<List<ResumeExperience>> getAll() {
		return new SuccessDataResult<List<ResumeExperience>>
		(this.resumeExperienceDao.findAll());
	}

	@Override
	public Result add(ResumeExperience resumeExperience) {
		this.resumeExperienceDao.save(resumeExperience);
		return new SuccessResult();
	}

}

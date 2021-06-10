package busra.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import busra.hrms.business.abstracts.ResumeEducationService;
import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.core.utilities.results.SuccessDataResult;
import busra.hrms.core.utilities.results.SuccessResult;
import busra.hrms.dataAccess.abstracts.ResumeEducationDao;
import busra.hrms.entities.concretes.ResumeEducation;

@Service
public class ResumeEducationManager implements ResumeEducationService{
	
	private ResumeEducationDao resumeEducationDao;
	
	@Autowired
	public ResumeEducationManager(ResumeEducationDao resumeEducationDao) {
		super();
		this.resumeEducationDao = resumeEducationDao;
	}
	
	@Override
	public DataResult<List<ResumeEducation>> getAll() {
		return new SuccessDataResult<List<ResumeEducation>>
		(this.resumeEducationDao.findAll());
	}

	@Override
	public Result add(ResumeEducation resumeEducation) {
		this.resumeEducationDao.save(resumeEducation);
		return new SuccessResult();
	}
	
}

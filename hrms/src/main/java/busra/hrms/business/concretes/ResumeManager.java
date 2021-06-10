package busra.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import busra.hrms.business.abstracts.ResumeService;
import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.core.utilities.results.SuccessDataResult;
import busra.hrms.core.utilities.results.SuccessResult;
import busra.hrms.dataAccess.abstracts.ResumeDao;
import busra.hrms.entities.concretes.Resume;

@Service
public class ResumeManager implements ResumeService {
	
	private ResumeDao resumeDao;
	
	@Autowired
	public ResumeManager(ResumeDao resumeDao) {
		super();
		this.resumeDao = resumeDao;
	}

	@Override
	public DataResult<List<Resume>> getAll() {
		return new SuccessDataResult<List<Resume>>
		(this.resumeDao.findAll());
	}

	@Override
	public Result add(Resume resume) {
		this.resumeDao.save(resume);
		return new SuccessResult();
	}

}

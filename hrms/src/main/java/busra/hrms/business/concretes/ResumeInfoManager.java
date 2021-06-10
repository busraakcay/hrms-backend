package busra.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import busra.hrms.business.abstracts.ResumeInfoService;
import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.core.utilities.results.SuccessDataResult;
import busra.hrms.core.utilities.results.SuccessResult;
import busra.hrms.dataAccess.abstracts.ResumeInfoDao;
import busra.hrms.entities.concretes.ResumeInfo;

@Service
public class ResumeInfoManager implements ResumeInfoService {
	
	private ResumeInfoDao resumeInfoDao;
	
	@Autowired
	public ResumeInfoManager(ResumeInfoDao resumeInfoDao) {
		super();
		this.resumeInfoDao = resumeInfoDao;
	}

	@Override
	public DataResult<List<ResumeInfo>> getAll() {
		return new SuccessDataResult<List<ResumeInfo>>
		(this.resumeInfoDao.findAll());
	}

	@Override
	public Result add(ResumeInfo resumeInfo) {
		this.resumeInfoDao.save(resumeInfo);
		return new SuccessResult();
	}

}

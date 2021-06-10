package busra.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import busra.hrms.business.abstracts.ResumeTechnologyService;
import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.core.utilities.results.SuccessDataResult;
import busra.hrms.core.utilities.results.SuccessResult;
import busra.hrms.dataAccess.abstracts.ResumeTechnologyDao;
import busra.hrms.entities.concretes.ResumeTechnology;

@Service
public class ResumeTechnologyManager implements ResumeTechnologyService {
	
	private ResumeTechnologyDao resumeTechnologyDao;
	
	@Autowired
	public ResumeTechnologyManager(ResumeTechnologyDao resumeTechnologyDao) {
		super();
		this.resumeTechnologyDao = resumeTechnologyDao;
	}

	@Override
	public DataResult<List<ResumeTechnology>> getAll() {
		return new SuccessDataResult<List<ResumeTechnology>>
		(this.resumeTechnologyDao.findAll());
	}

	@Override
	public Result add(ResumeTechnology resumeTechnology) {
		this.resumeTechnologyDao.save(resumeTechnology);
		return new SuccessResult();
	}

}

package busra.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import busra.hrms.business.abstracts.UnemployedService;
import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.core.utilities.results.SuccessDataResult;
import busra.hrms.core.utilities.results.SuccessResult;
import busra.hrms.dataAccess.abstracts.UnemployedDao;
import busra.hrms.entities.concretes.Unemployed;

@Service
public class UnemployedManager implements UnemployedService{
	
	private UnemployedDao unemployedDao;
	
	@Autowired
	public UnemployedManager(UnemployedDao unemployedDao) {
		super();
		this.unemployedDao = unemployedDao;
	}

	@Override
	public DataResult<List<Unemployed>> getAll() {
		return new SuccessDataResult<List<Unemployed>>
		(this.unemployedDao.findAll(),"Unemployeds are listed.");
	}

	@Override
	public Result add(Unemployed unemployed) {
		this.unemployedDao.save(unemployed);
		return new SuccessResult("Unemployed is added.");
	}

}
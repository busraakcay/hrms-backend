package busra.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import busra.hrms.adapters.abstracts.MernisCheckService;
import busra.hrms.business.abstracts.UnemployedService;
import busra.hrms.core.abstracts.UnemployedEmailCheckService;
import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.ErrorResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.core.utilities.results.SuccessDataResult;
import busra.hrms.core.utilities.results.SuccessResult;
import busra.hrms.dataAccess.abstracts.UnemployedDao;
import busra.hrms.entities.concretes.Unemployed;

@Service
public class UnemployedManager implements UnemployedService{
	
	private UnemployedDao unemployedDao;
	private MernisCheckService mernisCheckService;
	private UnemployedEmailCheckService unemployedEmailCheckService;
	
	@Autowired
	public UnemployedManager(
			UnemployedDao unemployedDao,
			MernisCheckService mernisCheckService,
			UnemployedEmailCheckService unemployedEmailCheckService) {
		
		super();
		this.unemployedDao = unemployedDao;
		this.mernisCheckService = mernisCheckService;
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Override
	public boolean findByNationalityId(String nationalityId) {
		if (this.unemployedDao.findByNationalityId(nationalityId).contains(nationalityId)) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public DataResult<List<Unemployed>> getAll() {
		return new SuccessDataResult<List<Unemployed>>
		(this.unemployedDao.findAll(),"Unemployeds are listed.");
	}

	@Override
	public Result unemployedRegister(Unemployed unemployed) {
		if (findByNationalityId(unemployed.getNationalityId()) &&
			this.mernisCheckService.checkIfRealPerson(unemployed) || //or
			this.unemployedEmailCheckService.checkEmail(unemployed.getEmail()) 
			){
			this.unemployedDao.save(unemployed);
			return new SuccessResult("Unemployed is added.");
		}else {
			return new ErrorResult("Unemployed is not added.");
		}
	}
}
package busra.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import busra.hrms.business.abstracts.EmployerService;
import busra.hrms.core.abstracts.EmployerEmailCheckService;
import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.ErrorResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.core.utilities.results.SuccessDataResult;
import busra.hrms.core.utilities.results.SuccessResult;
import busra.hrms.entities.concretes.Employer;
import busra.hrms.dataAccess.abstracts.EmployerDao;

@Service
public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;
	private EmployerEmailCheckService employerEmailCheckService;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao, EmployerEmailCheckService employerEmailCheckService) {
		super();
		this.employerDao = employerDao;
		this.employerEmailCheckService = employerEmailCheckService;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>
		(this.employerDao.findAll(),"Employers are listed.");
	}

	@Override
	public Result employerRegister(Employer employer) {
		if (this.employerEmailCheckService.checkEmail(employer.getEmail())) {
			this.employerDao.save(employer);
			return new SuccessResult("Employer is added.");
		}else {
			return new ErrorResult("Employer is not added.");
		}
	}

}

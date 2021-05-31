package busra.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import busra.hrms.business.abstracts.AdService;
import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.ErrorDataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.core.utilities.results.SuccessDataResult;
import busra.hrms.core.utilities.results.SuccessResult;
import busra.hrms.dataAccess.abstracts.AdDao;
import busra.hrms.entities.concretes.Ad;

@Service
public class AdManager implements AdService{
	
	@Autowired
	private AdDao adDao;

	public AdManager(AdDao adDao) {
		super();
		this.adDao = adDao;
	}
	
	@Override
	public DataResult<List<Ad>> getAll() {
		return new SuccessDataResult<List<Ad>>
		(this.adDao.findAll(), "Ads are listed.");
	}

	@Override
	public DataResult<List<Ad>> getAllActive() {
		Ad ad = new Ad();
		if(ad.isStatus() == true) {
			return new SuccessDataResult<List<Ad>>
			(this.adDao.findAll(), "Active ads are listed.");
		}else {
			return new ErrorDataResult<List<Ad>>("An error occured.");
		}
		
	}

	@Override
	public Result add(Ad ad) {
		this.adDao.save(ad);
		return new SuccessResult("Ad is added");
	}

	@Override
	public DataResult<List<Ad>> getByStatusTrue() {
		return new SuccessDataResult<List<Ad>>
		(this.adDao.getByStatusTrue());
	}

	@Override
	public DataResult<List<Ad>> getByStatusTrueOrderByDeadline() {
		return new SuccessDataResult<List<Ad>>
		(this.adDao.getByStatusTrueOrderByDeadline());
	}

	@Override
	public DataResult<List<Ad>> getByStatusTrueAndEmployerId(int employerId) {
		return new SuccessDataResult<List<Ad>>
		(this.adDao.getByStatusTrueAndEmployerId(employerId));
	}

	@Override
	public Result updateStatus(boolean status, int id) {
		this.adDao.updateStatus(status, id);
        return new SuccessResult("Change saved successfully.");
	}

}

package busra.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import busra.hrms.dataAccess.abstracts.PositionDao;
import busra.hrms.entities.concretes.Position;
import busra.hrms.business.abstracts.PositionService;
import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.core.utilities.results.SuccessDataResult;
import busra.hrms.core.utilities.results.SuccessResult;


@Service
public class PositionManager implements PositionService{

	private PositionDao positionDao;
	
	@Autowired
	public PositionManager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}

	@Override
	public DataResult<List<Position>> getAll() {
		return new SuccessDataResult<List<Position>>
		(this.positionDao.findAll(),"Positions are listed.");
	}

	@Override
	public Result add(Position position) {
		this.positionDao.save(position);
		return new SuccessResult("Position is added.");
	}
	
}
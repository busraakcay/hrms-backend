package busra.hrms.business.abstracts;

import java.util.List;

import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.entities.concretes.Position;

 public interface PositionService {
	 DataResult<List<Position>> getAll();
	 Result add(Position position);
}

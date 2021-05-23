package busra.hrms.business.abstracts;

import java.util.List;

import busra.hrms.entities.concretes.Position;

 public interface PositionService {
	List<Position> getAll();
}

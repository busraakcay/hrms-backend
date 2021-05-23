package busra.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import busra.hrms.entities.concretes.Position;

public interface PositionDao extends JpaRepository<Position, Integer>{
	
}
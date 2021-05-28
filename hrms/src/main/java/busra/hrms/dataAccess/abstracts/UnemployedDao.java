package busra.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import busra.hrms.entities.concretes.Unemployed;

public interface UnemployedDao extends JpaRepository<Unemployed, Integer>{
	List<Unemployed> findByNationalityId(String nationalityId);
}

package busra.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import busra.hrms.entities.concretes.ResumeTechnology;

public interface ResumeTechnologyDao extends JpaRepository<ResumeTechnology, Integer>{

}

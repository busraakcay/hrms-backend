package busra.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import busra.hrms.entities.concretes.Personnel;

public interface PersonnelDao extends JpaRepository<Personnel, Integer>{

}

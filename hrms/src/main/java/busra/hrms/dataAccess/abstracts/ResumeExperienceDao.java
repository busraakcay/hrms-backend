package busra.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import busra.hrms.entities.concretes.ResumeExperience;

public interface ResumeExperienceDao extends JpaRepository<ResumeExperience, Integer>{

}

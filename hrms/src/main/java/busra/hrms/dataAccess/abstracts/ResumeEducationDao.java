package busra.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import busra.hrms.entities.concretes.ResumeEducation;

public interface ResumeEducationDao extends JpaRepository<ResumeEducation, Integer> {

}

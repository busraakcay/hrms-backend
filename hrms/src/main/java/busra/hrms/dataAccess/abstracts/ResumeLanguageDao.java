package busra.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import busra.hrms.entities.concretes.ResumeLanguage;

public interface ResumeLanguageDao extends JpaRepository<ResumeLanguage, Integer>{

}

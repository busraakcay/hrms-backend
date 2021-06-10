package busra.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import busra.hrms.entities.concretes.Resume;

public interface ResumeDao extends JpaRepository<Resume, Integer> {

}

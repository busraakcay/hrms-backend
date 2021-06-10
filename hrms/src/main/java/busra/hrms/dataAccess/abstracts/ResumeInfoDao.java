package busra.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import busra.hrms.entities.concretes.ResumeInfo;

public interface ResumeInfoDao extends JpaRepository<ResumeInfo, Integer>{

}

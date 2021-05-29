package busra.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import busra.hrms.entities.concretes.Verification;

public interface VerificationDao extends JpaRepository<Verification, Integer>{

}

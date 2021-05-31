package busra.hrms.dataAccess.abstracts;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import busra.hrms.entities.concretes.Ad;

public interface AdDao extends JpaRepository<Ad, Integer> {
	List<Ad> getByStatusTrue();
    List<Ad> getByStatusTrueOrderByDeadline();
    List<Ad> getByStatusTrueAndEmployerId(int employerId);
    
    @Transactional
    @Modifying
    @Query("Update Ad a set a.status=:status where a.id=:id")
    void updateStatus(boolean status, int id);
}

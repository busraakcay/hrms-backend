package busra.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import busra.hrms.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer> {

}
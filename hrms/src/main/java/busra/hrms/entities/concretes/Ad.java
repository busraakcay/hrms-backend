package busra.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "ads")
@AllArgsConstructor
@NoArgsConstructor
public class Ad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "min_salary")
	private int minSalary;
	
	@Column(name = "max_salary")
	private int maxSalary;
	
	@Column(name = "position_amount")
	private int positionAmount;
	
	@Column(name = "deadline")
	private LocalDate deadline;
	
	@Column(name = "status")
	private boolean status;
	
	@ManyToOne()
    @JoinColumn(name="position_id")
    private Position position;
	
	@ManyToOne()
    @JoinColumn(name="city_id")
    private City city;
	
	@ManyToOne()
    @JoinColumn(name="employer_id")
    private Employer employer;
}

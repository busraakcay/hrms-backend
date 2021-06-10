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
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
	
	@Column(name = "description")
	@NotBlank
	@NotNull
	private String description;
	
	@Column(name = "min_salary")
	@NotBlank
	@NotNull
	private int minSalary;
	
	@Column(name = "max_salary")
	@NotBlank
	@NotNull
	private int maxSalary;
	
	@Column(name = "position_amount")
	@NotBlank
	@NotNull
	private int positionAmount;
	
	@Column(name = "deadline")
	@NotBlank
	@NotNull
	private LocalDate deadline;
	
	@Column(name = "status")
	@NotBlank
	@NotNull
	private boolean status;
	
	@ManyToOne()
    @JoinColumn(name="position_id")
	@NotBlank
	@NotNull
    private Position position;
	
	@ManyToOne()
    @JoinColumn(name="city_id")
	@NotBlank
	@NotNull
    private City city;
	
	@ManyToOne()
    @JoinColumn(name="employer_id")
	@NotBlank
	@NotNull
    private Employer employer;
}

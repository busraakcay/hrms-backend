package busra.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "resume_educations")
@AllArgsConstructor
@NoArgsConstructor
public class ResumeEducation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "school_name")
	@NotBlank
	@NotNull
	private String schoolName;
	
	@Column(name = "department_name")
	@NotBlank
	@NotNull
	private String departmentName;
	
	@Column(name = "start_date")
	@NotBlank
	@NotNull
	private LocalDate startDate;
	
	@Column(name = "finish_date")
	@NotBlank
	@NotNull
	private LocalDate finishDate;
	
	@Column(name = "graduation_year")
	private LocalDate graduationYear;
	
	@ManyToOne()
    @JoinColumn(name="unemployed_id")
	@JsonIgnore()
	@NotBlank
	@NotNull
	private Unemployed unemployed;
	
	@OneToMany(mappedBy = "resumeEducation", fetch = FetchType.LAZY)
	@JsonIgnore()
	private List<Resume> resume;
	
}

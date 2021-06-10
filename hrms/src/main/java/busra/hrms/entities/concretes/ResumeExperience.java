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
@Table(name = "resume_experiences")
@AllArgsConstructor
@NoArgsConstructor
public class ResumeExperience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "work_definition")
	@NotBlank
	@NotNull
	private String workDefinition;
	
	@Column(name = "work_position")
	@NotBlank
	@NotNull
	private String workPosition;
	
	@Column(name = "start_date")
	@NotBlank
	@NotNull
	private LocalDate startDate;
	
	@Column(name = "finish_date")
	private LocalDate finishDate;
	
	@Column(name = "status")
	private boolean status;
	
	@ManyToOne()
    @JoinColumn(name="unemployed_id")
	@JsonIgnore()
	@NotBlank
	@NotNull
	private Unemployed unemployed;
	
	@OneToMany(mappedBy = "resumeExperience", fetch = FetchType.LAZY)
	@JsonIgnore()
	private List<Resume> resume;
}

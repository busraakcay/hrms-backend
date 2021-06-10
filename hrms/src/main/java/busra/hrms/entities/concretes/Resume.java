package busra.hrms.entities.concretes;

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
@Table(name = "resumes")
@AllArgsConstructor
@NoArgsConstructor
public class Resume {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne()
    @JoinColumn(name="unemployed_id")
	@NotBlank
	@NotNull
	private Unemployed unemployed;
	
	@ManyToOne()
    @JoinColumn(name="resumeEducation_id")
	@NotBlank
	@NotNull
	private ResumeEducation resumeEducation;
	
	@ManyToOne()
    @JoinColumn(name="resumeExperience_id")
	@NotBlank
	@NotNull
	private ResumeExperience resumeExperience;
	
	@ManyToOne()
    @JoinColumn(name="resumeInfo_id")
	@NotBlank
	@NotNull
	private ResumeInfo resumeInfo;
	
	@ManyToOne()
    @JoinColumn(name="resumeLanguage_id")
	@NotBlank
	@NotNull
	private ResumeLanguage resumeLanguage;
	
	@ManyToOne()
    @JoinColumn(name="resumeTechnology_id")
	@NotBlank
	@NotNull
	private ResumeTechnology resumeTechnology;
}

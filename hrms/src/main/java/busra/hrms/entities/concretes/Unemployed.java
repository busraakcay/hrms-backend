package busra.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "unemployeds")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id")
@EqualsAndHashCode(callSuper=true)
public class Unemployed extends User {
	
	@Column(name = "name")
	@NotBlank
	@NotNull
	private String name;
	
	@Column(name = "surname")
	@NotBlank
	@NotNull
	private String surname;
	
	@Column(name = "nationality_id", unique = true)
	@NotBlank
	@NotNull
	private String nationalityId;
	
	@Column(name = "birth_year")
	@NotBlank
	@NotNull
	private int birthYear;
	
	@OneToMany(mappedBy = "unemployed", fetch = FetchType.LAZY)
	@JsonIgnore()
	private List<ResumeEducation> resumeEducation;
	
	@OneToMany(mappedBy = "unemployed", fetch = FetchType.LAZY)
	@JsonIgnore()
	private List<ResumeExperience> resumeExperience;
	
	@OneToMany(mappedBy = "unemployed", fetch = FetchType.LAZY)
	@JsonIgnore()
	private List<ResumeLanguage> resumeLanguage;
	
	@OneToMany(mappedBy = "unemployed", fetch = FetchType.LAZY)
	@JsonIgnore()
	private List<ResumeTechnology> resumeTechnology;
	
	@OneToMany(mappedBy = "unemployed", fetch = FetchType.LAZY)
	@JsonIgnore()
	private List<ResumeInfo> resumeInfo;
	
	@OneToMany(mappedBy = "unemployed", fetch = FetchType.LAZY)
	@JsonIgnore()
	private List<Resume> resume;
}

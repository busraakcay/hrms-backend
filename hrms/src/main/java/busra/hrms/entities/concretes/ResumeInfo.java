package busra.hrms.entities.concretes;

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
@Table(name = "resume_infos")
@AllArgsConstructor
@NoArgsConstructor
public class ResumeInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "photo")
	private String photo;
	
	@Column(name = "cover_letter")
	private String coverLetter;
	
	@Column(name = "github")
	@NotBlank
	@NotNull
	private String github;
	
	@Column(name = "linkedin")
	@NotBlank
	@NotNull
	private String linkedin;
	
	@ManyToOne()
    @JoinColumn(name="unemployed_id")
	@JsonIgnore()
	@NotBlank
	@NotNull
	private Unemployed unemployed;
	
	@OneToMany(mappedBy = "resumeInfo", fetch = FetchType.LAZY)
	@JsonIgnore()
	private List<Resume> resume;
}

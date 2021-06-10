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
@Table(name = "resume_technologies")
@AllArgsConstructor
@NoArgsConstructor
public class ResumeTechnology {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "pl_info")
	@NotBlank
	@NotNull
	private String plInfo;
	
	@Column(name = "tool_info")
	@NotBlank
	@NotNull
	private String toolInfo;
	
	@ManyToOne()
    @JoinColumn(name="unemployed_id")
	@JsonIgnore()
	@NotBlank
	@NotNull
	private Unemployed unemployed;
	
	@OneToMany(mappedBy = "resumeTechnology", fetch = FetchType.LAZY)
	@JsonIgnore()
	private List<Resume> resume;
	
}

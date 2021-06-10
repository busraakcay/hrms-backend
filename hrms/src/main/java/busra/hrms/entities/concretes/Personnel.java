package busra.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "personnel")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id")
@EqualsAndHashCode(callSuper=true)
public class Personnel extends User {
	
	@Column(name = "name")
	@NotBlank
	@NotNull
	private String name;
	
	@Column(name = "surname")
	@NotBlank
	@NotNull
	private String surname;
}

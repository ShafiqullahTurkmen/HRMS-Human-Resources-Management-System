package kodlamaio.hrms.entities.concretes.jobseeker;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="skills")
@AllArgsConstructor
@NoArgsConstructor
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="skill_id")
	private int id;
	
	@Column(name="skill_name")
	@NotNull
	@NotBlank
	private String name;
	
	@Column(name="skill_level")
	@NotNull
	@NotBlank
	private int level;
	
	@ManyToOne()
	@JoinColumn(name="curriculumn_vitae_id")
	private CurriculumVitae curriculumVitae;

}

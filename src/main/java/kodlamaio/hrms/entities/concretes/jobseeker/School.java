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
@Table(name = "schools")
@AllArgsConstructor
@NoArgsConstructor
public class School {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="shool_id")
	private int id;
	
	@Column(name = "school_name")
	@NotNull
	@NotBlank
	private String schoolName;
	
	@Column(name = "school_department")
	@NotNull
	@NotBlank
	private String schoolDepartment;
	
	@Column(name = "school_join_date")
	@NotNull
	@NotBlank
	private String schooleJoinDate;
	
	@Column(name = "school_graduation_date")
	private String schoolGraduationDate;
	
	@Column(name = "school_is_graduated")
	@NotNull
	@NotBlank
	private boolean isGradutedFromSchool;

	@ManyToOne()
	@JoinColumn(name="curriculumn_vitae_id")
	private CurriculumVitae curriculumVitae;


}

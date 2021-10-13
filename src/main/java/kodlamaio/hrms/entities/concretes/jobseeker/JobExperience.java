package kodlamaio.hrms.entities.concretes.jobseeker;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_experiences")
@AllArgsConstructor
@NoArgsConstructor
public class JobExperience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="job_name")
	private String jobName;
	
	@Column(name="job_company_name")
	private String jobCompanyName;
	
	@Column(name="job_position_name")
	private String jobPositionName;
	
	@Column(name="job_join_date")
	private LocalDate jobJoinDate;
	
	@Column(name="job_resignation_date")
	private LocalDate jobResignationDate;
	
	@Column(name="job_is_leaved")
	private boolean isLeaved;
	
	@ManyToOne()
	@JoinColumn(name="curriculumn_vitae_id")
	private CurriculumVitae curriculumVitae;


}

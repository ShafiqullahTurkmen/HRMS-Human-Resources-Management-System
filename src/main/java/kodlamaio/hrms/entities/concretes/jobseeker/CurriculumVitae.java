package kodlamaio.hrms.entities.concretes.jobseeker;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="curriculum_vitaes")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","contact","languages","schools","jobExperiences","skills","photos"})
public class CurriculumVitae {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="curriculumn_vitae_id")
	private int id;
	
	@OneToMany(mappedBy = "curriculumVitae")
	private List<School> schools;
	
	@OneToMany(mappedBy = "curriculumVitae")
	private List<JobExperience> jobExperiences;
	
	@OneToMany(mappedBy = "curriculumVitae")
	private List<Language> languages;
	
	@OneToMany(mappedBy = "curriculumVitae")
	private List<Contact> contact;
	
	@OneToMany(mappedBy = "curriculumVitae")
	private List<Skill> skills;
	
	@OneToMany(mappedBy = "curriculumVitae")
	private List<Photo> photos;
	
	@Column(name="description")
	@NotBlank
	@NotNull
	private String description;
	
	@ManyToOne()
	@JoinColumn(name="user_id")
	private JobSeeker jobSeeker;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

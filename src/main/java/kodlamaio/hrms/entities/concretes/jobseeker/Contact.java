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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="contacts")
@AllArgsConstructor
@NoArgsConstructor
public class Contact{


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="contact_telephone")
	private String telephone;
	
	@Column(name="contact_github")
	@NotBlank
	@NotNull
	private String github;
	
	@Column(name="contact_linkedin")
	@NotBlank
	@NotNull
	private String linkedin;
	
	@Column(name="contact_address")
	@NotBlank
	@NotNull
	private String address;
	
	@ManyToOne()
	@JoinColumn(name="curriculumn_vitae_id")
	private CurriculumVitae curriculumVitae;
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

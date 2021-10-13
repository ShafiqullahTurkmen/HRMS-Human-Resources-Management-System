package kodlamaio.hrms.dataAccess.abstracts.jobseeker;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.jobseeker.Contact;

public interface ContactDao extends JpaRepository<Contact, Integer>{
	
	List<Contact> findByCurriculumVitae_id(int curriculumVitaeId);

}

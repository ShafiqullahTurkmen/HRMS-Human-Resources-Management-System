package kodlamaio.hrms.dataAccess.abstracts.jobseeker;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.jobseeker.Language;

public interface LanguageDao extends JpaRepository<Language, Integer>{
	
	List<Language> findByCurriculumVitae_id(int curriculumVitaeId);
	

}

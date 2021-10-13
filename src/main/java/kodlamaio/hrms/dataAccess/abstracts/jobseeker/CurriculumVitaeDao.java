package kodlamaio.hrms.dataAccess.abstracts.jobseeker;




import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.jobseeker.CurriculumVitae;

public interface CurriculumVitaeDao extends JpaRepository<CurriculumVitae, Integer>{
	  
	
	CurriculumVitae getById(int id);
	CurriculumVitae getByJobSeekerId(int id);

	

}

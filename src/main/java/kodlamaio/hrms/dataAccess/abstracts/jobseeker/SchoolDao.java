package kodlamaio.hrms.dataAccess.abstracts.jobseeker;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrms.entities.concretes.jobseeker.School;

public interface SchoolDao extends JpaRepository<School, Integer>{
	
	
	List<School> findByCurriculumVitae_idOrderBySchoolGraduationDateDesc(int id);
	


}

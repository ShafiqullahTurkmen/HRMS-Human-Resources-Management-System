package kodlamaio.hrms.dataAccess.abstracts.jobseeker;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.jobseeker.JobExperience;

public interface JobExperienceDao extends JpaRepository<JobExperience, Integer> {

	List<JobExperience> findByCurriculumVitae_idOrderByJobResignationDateDesc(int id);
}

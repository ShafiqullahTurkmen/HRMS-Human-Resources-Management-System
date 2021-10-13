package kodlamaio.hrms.dataAccess.abstracts.jobseeker;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.jobseeker.Skill;

public interface SkillDao extends JpaRepository<Skill, Integer> {
	
	List<Skill> getByCurriculumVitae_id(int curriculumVitaeId);

}

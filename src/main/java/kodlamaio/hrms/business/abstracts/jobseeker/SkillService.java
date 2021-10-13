package kodlamaio.hrms.business.abstracts.jobseeker;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.jobseeker.Skill;

public interface SkillService {

	Result add(Skill skill);
	DataResult<List<Skill>> getAll();
	DataResult<List<Skill>> getByCurriculumVitaeId(int curriculumVataeId);
}

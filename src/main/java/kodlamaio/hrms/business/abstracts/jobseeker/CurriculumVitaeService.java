package kodlamaio.hrms.business.abstracts.jobseeker;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.jobseeker.CurriculumVitae;

public interface CurriculumVitaeService {
	Result add(CurriculumVitae curriculumVitae);
	DataResult<List<CurriculumVitae>> getAll();
	DataResult<CurriculumVitae> getById(int id);
	DataResult<CurriculumVitae> getByJobSeekerId(int id);

}

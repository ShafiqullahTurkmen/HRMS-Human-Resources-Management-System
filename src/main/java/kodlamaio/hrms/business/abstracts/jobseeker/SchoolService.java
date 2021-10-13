package kodlamaio.hrms.business.abstracts.jobseeker;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.jobseeker.School;

public interface SchoolService {

	Result add(School school);
	DataResult<List<School>> getAll();
	DataResult<List<School>> getByCVId(int id);

}

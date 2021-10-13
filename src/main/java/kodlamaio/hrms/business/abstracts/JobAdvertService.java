package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvert;

public interface JobAdvertService {
	Result add(JobAdvert jobAdvert);
	DataResult<List<JobAdvert>> getAll();
	DataResult<List<JobAdvert>> getActiveJobAdverts();
	DataResult<List<JobAdvert>> getActiveJobAdvertsByDeadline();
	DataResult<List<JobAdvert>> getByIsActiveTrueAndEmployer_Id(int id);
	Result updateJobAdvertByEmployer(int id, boolean isActive);
	

}

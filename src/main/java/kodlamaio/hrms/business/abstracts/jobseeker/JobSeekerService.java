package kodlamaio.hrms.business.abstracts.jobseeker;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.dtos.JobSeekerDto;
import kodlamaio.hrms.entities.concretes.jobseeker.JobSeeker;

public interface JobSeekerService {

	DataResult<List<JobSeekerDto>> getAll();
	Result add(JobSeeker jobSeeker);
	DataResult<JobSeekerDto> getById(int jobSeekerId);
	


}

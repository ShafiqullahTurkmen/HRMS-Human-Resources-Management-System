package kodlamaio.hrms.adapters.abstracts;

import kodlamaio.hrms.entities.concretes.jobseeker.JobSeeker;

public interface JobSeekerCheckService {
	boolean checkIfRealPerson(JobSeeker jobSeeker);
}

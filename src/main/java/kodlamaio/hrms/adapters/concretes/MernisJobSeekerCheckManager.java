package kodlamaio.hrms.adapters.concretes;


import org.springframework.stereotype.Service;

import kodlamaio.hrms.adapters.abstracts.JobSeekerCheckService;
import kodlamaio.hrms.entities.concretes.jobseeker.JobSeeker;

@Service
public class MernisJobSeekerCheckManager implements JobSeekerCheckService {

	
	@Override
	public boolean checkIfRealPerson(JobSeeker jobSeeker) {
		
		return jobSeeker.getIdentityNumber().length() == 11 ? true : false;
		
			
	}

}

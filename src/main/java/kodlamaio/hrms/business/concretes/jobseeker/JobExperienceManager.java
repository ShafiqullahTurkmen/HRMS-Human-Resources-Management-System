package kodlamaio.hrms.business.concretes.jobseeker;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.jobseeker.JobExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.jobseeker.JobExperienceDao;
import kodlamaio.hrms.entities.concretes.jobseeker.JobExperience;

@Service
public class JobExperienceManager implements JobExperienceService{

	@Autowired
	private JobExperienceDao jobExperienceDao;
	
	@Override
	public Result add(JobExperience jobExperience) {
		this.jobExperienceDao.save(jobExperience);
		return new SuccessResult("İş Tecrubesi eklendi");
	}

	@Override
	public DataResult<List<JobExperience>> getAll() {
		return new SuccessDataResult<List<JobExperience>>
		(this.jobExperienceDao.findAll(), "Tüm işTecrübei listelendi.");
	}

	@Override
	public DataResult<List<JobExperience>> getByCVId(int id) {
		
		ArrayList<JobExperience> jobExperiences = (ArrayList<JobExperience>) this.jobExperienceDao
				.findByCurriculumVitae_idOrderByJobResignationDateDesc(id);
		
		for(JobExperience jobExperience: jobExperiences) {
			if(!(jobExperience.isLeaved())) {
				return new SuccessDataResult<List<JobExperience>>
				(this.jobExperienceDao.findByCurriculumVitae_idOrderByJobResignationDateDesc(id),
				"Aday " + jobExperience.getJobCompanyName() + " şirketinde çalışmaya devam ediyor.");
			}
		}
		
		
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao
				.findByCurriculumVitae_idOrderByJobResignationDateDesc(id)
				,"Adayin Çaliştığı şirketler.");
	}

	
}

package kodlamaio.hrms.business.concretes.jobseeker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.adapters.abstracts.EmailVerificationService;
import kodlamaio.hrms.adapters.abstracts.JobSeekerCheckService;
import kodlamaio.hrms.business.abstracts.jobseeker.JobSeekerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.jobseeker.JobSeekerDao;
import kodlamaio.hrms.entities.concretes.dtos.JobSeekerDto;
import kodlamaio.hrms.entities.concretes.jobseeker.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{
	@Autowired
	private JobSeekerDao jobSeekerDao;
	@Autowired
	private JobSeekerCheckService jobSeekerCheckService;
	@Autowired
	private EmailVerificationService emailVerificationService;
	
	
	
	
	

	@Override
	public DataResult<List<JobSeekerDto>> getAll() {
		return new SuccessDataResult<List<JobSeekerDto>>
		(this.jobSeekerDao.getAll(), "Iş Arayanlar listelendi");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		
		if (!jobSeeker.getPasswordRepeat().equals(jobSeeker.getPassword())) {
			return new ErrorResult("Şifre tekrarını doğru giriniz lütfen.");
			
		} else if(jobSeekerCheckService.checkIfRealPerson(jobSeeker)) {
			
			if(this.jobSeekerDao.existsByIdentityNumber(jobSeeker.getIdentityNumber())) {
				return new ErrorResult("Bu TC kimlik numarası başka kullanıcıya ayittir.");
			} 
			else if(this.jobSeekerDao.existsByEmail(jobSeeker.getEmail())) {
				return new ErrorResult("Bu Email address başka birine kullanıcıya ayittir.");
			}
			else if(this.emailVerificationService.isEmailVerified(jobSeeker.getEmail())) {
				this.jobSeekerDao.save(jobSeeker);
			}
			
			return new SuccessResult("Email addressi Kullanıcı tarafından onaylandı, Iş Arayan eklendi ");
			
		} else {
			return new ErrorResult("Invalid person to add");
		}
		
	}
	

	@Override
	public DataResult<JobSeekerDto> getById(int jobSeekerId) {
		return new SuccessDataResult<JobSeekerDto>(this.jobSeekerDao.getByJobSeekerId
				(jobSeekerId),"Id'ye göre Çalışan getirildi.");
	}


	

}

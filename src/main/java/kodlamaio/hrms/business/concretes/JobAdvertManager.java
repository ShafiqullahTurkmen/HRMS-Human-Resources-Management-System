package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertDao;
import kodlamaio.hrms.entities.concretes.JobAdvert;

@Service
public class JobAdvertManager implements JobAdvertService {

	private JobAdvertDao jobAdvertDao;
	
	
	@Autowired
	public JobAdvertManager(JobAdvertDao jobAdvertDao) {
		super();
		this.jobAdvertDao = jobAdvertDao;
	}

	@Override
	public Result add(JobAdvert jobAdvert) {
		this.jobAdvertDao.save(jobAdvert);
		return new SuccessResult("iş ilanı eklendi.");
	}

	@Override
	public DataResult<List<JobAdvert>> getAll() {
		
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAll(), "tüm iş ilanları listelendi.");
	}

	@Override
	public DataResult<List<JobAdvert>> getActiveJobAdverts() {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getByIsActiveTrue(), "Active iş ilanları listelendi.");
	}

	@Override
	public DataResult<List<JobAdvert>> getActiveJobAdvertsByDeadline() {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findByIsActiveTrueOrderByDeadlineDesc(), "İş ilanları tarihe gore listelendi.");
	}

	@Override
	public DataResult<List<JobAdvert>> getByIsActiveTrueAndEmployer_Id(int id) {
		
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findByIsActiveTrueAndEmployer_Id(id), "Firmanin Aktif iş ilanları");
	}

	@Override
	public Result updateJobAdvertByEmployer(int id, boolean isActive) {
		
		JobAdvert jobAdvert = this.jobAdvertDao.findById(id);
		jobAdvert.setActive(isActive);
		this.jobAdvertDao.save(jobAdvert);
		
		return new SuccessResult("İş ilanı İş Veren tarafından güncellendi.");
	}

	

	
}

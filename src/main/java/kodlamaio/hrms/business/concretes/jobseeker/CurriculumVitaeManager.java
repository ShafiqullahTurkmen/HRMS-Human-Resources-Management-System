package kodlamaio.hrms.business.concretes.jobseeker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.jobseeker.CurriculumVitaeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.jobseeker.CurriculumVitaeDao;
import kodlamaio.hrms.entities.concretes.jobseeker.CurriculumVitae;

@Service
public class CurriculumVitaeManager implements CurriculumVitaeService{

	@Autowired
	private CurriculumVitaeDao curriculumVitaeDao;
	
	@Override
	public Result add(CurriculumVitae curriculumVitae) {
		this.curriculumVitaeDao.save(curriculumVitae);
		return new SuccessResult("CV eklendi.");
	}

	@Override
	public DataResult<List<CurriculumVitae>> getAll() {
		
		return new SuccessDataResult<List<CurriculumVitae>>(this.curriculumVitaeDao.findAll(), "Tüm CV'ler listelendi");
	}

	@Override
	public DataResult<CurriculumVitae> getById(int id) {
		return new SuccessDataResult<CurriculumVitae>(this.curriculumVitaeDao.getById(id),"Id'ye göre getirildi.");
	}

	@Override
	public DataResult<CurriculumVitae> getByJobSeekerId(int id) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<CurriculumVitae>(this.curriculumVitaeDao.getByJobSeekerId(id),"JobSeeker Id'ye göre getirildi.");
	}




	
}

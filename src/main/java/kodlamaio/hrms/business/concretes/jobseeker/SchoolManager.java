package kodlamaio.hrms.business.concretes.jobseeker;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.jobseeker.SchoolService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.jobseeker.SchoolDao;
import kodlamaio.hrms.entities.concretes.jobseeker.School;

@Service
public class SchoolManager implements SchoolService{

	@Autowired
	private SchoolDao schoolDao;
	
	@Override
	public Result add(School school) {
		this.schoolDao.save(school);
		return new SuccessResult("Yeni School eklendi.");
	}

	@Override
	public DataResult<List<School>> getAll() {
		
		return new SuccessDataResult<List<School>>(
				this.schoolDao.findAll(), "Tüm School listelendi.");
	}

	@Override
	public DataResult<List<School>> getByCVId(int id) {
		
		ArrayList<School> schools = (ArrayList<School>) this.schoolDao.findByCurriculumVitae_idOrderBySchoolGraduationDateDesc(id);
		for(School school:schools) {
			if(!(school.isGradutedFromSchool())) {
				return new SuccessDataResult<List<School>>(
						this.schoolDao.findByCurriculumVitae_idOrderBySchoolGraduationDateDesc(id),
						"Adayın " + school.getSchoolName() + " okulunda eğitimi devam ediyor....");
			}
		}
		
		
		return new SuccessDataResult<List<School>>(
				this.schoolDao.findByCurriculumVitae_idOrderBySchoolGraduationDateDesc(id),
				"Adayın okuduğu okullar.");
	}
	
	

	
}

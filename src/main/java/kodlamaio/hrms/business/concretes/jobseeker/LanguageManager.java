package kodlamaio.hrms.business.concretes.jobseeker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.jobseeker.LanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.jobseeker.LanguageDao;
import kodlamaio.hrms.entities.concretes.jobseeker.Language;

@Service
public class LanguageManager implements LanguageService{

	@Autowired
	private LanguageDao languagDao;
	
	@Override
	public Result add(Language language) {
		this.languagDao.save(language);
		return new SuccessResult("Yeni Dil eklendi");
	}

	

	
	@Override
	public DataResult<List<Language>> getAll() {
		return new SuccessDataResult<List<Language>>(this.languagDao.findAll()
				, "Tüm Diller sıralandi");
	}

	@Override
	public DataResult<List<Language>> getByCurriculumVitaeId(int curriculumVitaeId) {
		return new SuccessDataResult<List<Language>>(this.languagDao
				.findByCurriculumVitae_id(curriculumVitaeId),"CV'ye göre diller sıralandı.");
	}



	
}

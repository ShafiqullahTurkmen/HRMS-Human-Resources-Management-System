package kodlamaio.hrms.business.concretes.jobseeker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.jobseeker.SkillService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.jobseeker.SkillDao;
import kodlamaio.hrms.entities.concretes.jobseeker.Skill;

@Service
public class SkillManager implements SkillService {

	@Autowired
	private SkillDao skilldao;
	
	@Override
	public Result add(Skill skill) {
		this.skilldao.save(skill);
		return new SuccessResult("Yeni Skill eklendi.");
		
	}

	@Override
	public DataResult<List<Skill>> getAll() {
		return new SuccessDataResult<List<Skill>>(this.skilldao.findAll(), "Tüm skill listelendi");
	}

	@Override
	public DataResult<List<Skill>> getByCurriculumVitaeId(int curriculumVataeId) {
		return new SuccessDataResult<List<Skill>>(this.skilldao.getByCurriculumVitae_id(curriculumVataeId),"CV'nin id'sine göre Skill listelendi.");
	}

}

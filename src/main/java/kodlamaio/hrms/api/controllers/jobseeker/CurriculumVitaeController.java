package kodlamaio.hrms.api.controllers.jobseeker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.jobseeker.CurriculumVitaeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.jobseeker.CurriculumVitae;

@RestController
@RequestMapping("/api/curriculumvitae")
public class CurriculumVitaeController {

	@Autowired
	private CurriculumVitaeService curriculumVitaeService;
	
	@PostMapping("/add")
	public Result add(@RequestBody CurriculumVitae curriculumVitae) {
		return this.curriculumVitaeService.add(curriculumVitae);
	}
	
	@GetMapping("/getall")
	public DataResult<List<CurriculumVitae>> getAll() {
		return this.curriculumVitaeService.getAll();
	}
	

	@GetMapping("/getById")
	public DataResult<CurriculumVitae> getById(@RequestParam int id){
		return this.curriculumVitaeService.getById(id);
	}
	

	@GetMapping("/getByJoobSeekerId")
	public DataResult<CurriculumVitae> getByJobSeekerId(@RequestParam int jobSeekerId){
		return this.curriculumVitaeService.getByJobSeekerId(jobSeekerId);
	}

}

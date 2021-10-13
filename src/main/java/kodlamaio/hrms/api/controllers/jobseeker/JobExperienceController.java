package kodlamaio.hrms.api.controllers.jobseeker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.jobseeker.JobExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.jobseeker.JobExperience;

@RestController
@RequestMapping("/api/job_experiences")
public class JobExperienceController {
	
	@Autowired
	private JobExperienceService jobExperienceService;
	
	@PostMapping("/add")
	public Result add(@RequestBody JobExperience jobExperience) {
		return this.jobExperienceService.add(jobExperience);
	}

	
	@GetMapping("/getall")
	public DataResult<List<JobExperience>> getAll() {
		 
		return this.jobExperienceService.getAll();
	}
	
	@GetMapping("/getByCVId")
	public DataResult<List<JobExperience>> getByCVId(int id){
		return this.jobExperienceService.getByCVId(id);
	}
	
	
}

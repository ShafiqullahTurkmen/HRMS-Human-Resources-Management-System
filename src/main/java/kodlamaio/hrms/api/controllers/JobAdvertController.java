package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvert;

@RestController
@RequestMapping("/api/jobadverts")
public class JobAdvertController {
	
	private JobAdvertService jobAdvertService;

	@Autowired
	public JobAdvertController(JobAdvertService jobAdvertService) {
		super();
		this.jobAdvertService = jobAdvertService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvert jobAdvert) {
		
		return this.jobAdvertService.add(jobAdvert);
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvert>> getAll() {
		return this.jobAdvertService.getAll();
	}
	
	@GetMapping("/getActiveJobAdverts")
	public DataResult<List<JobAdvert>> getActiveJobAdverts() {
		return this.jobAdvertService.getActiveJobAdverts();
	}
	
	@GetMapping("/getActiveJobAdvertsByDeadline")
	public DataResult<List<JobAdvert>> getActiveJobAdvertsByDeadline() {
		return this.jobAdvertService.getActiveJobAdvertsByDeadline();
	}
	
	@GetMapping("/getByIsActiveTrueAndEmployer_Id") 
	public DataResult<List<JobAdvert>> getByIsActiveTrueAndEmployer_Id(@RequestParam int id) {
		return this.jobAdvertService.getByIsActiveTrueAndEmployer_Id(id);
	}
	
	@GetMapping("/updateJobAdvertByEmployer")
    public Result updateJobAdvertByEmployer(@RequestParam int id, @RequestParam boolean isActive) {
		
		return this.jobAdvertService.updateJobAdvertByEmployer(id, isActive);
	}
	
	
}

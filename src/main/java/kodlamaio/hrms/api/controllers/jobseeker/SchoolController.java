package kodlamaio.hrms.api.controllers.jobseeker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.jobseeker.SchoolService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.jobseeker.School;

@RestController
@RequestMapping("/api/schools")
public class SchoolController {
	
	@Autowired
	private SchoolService schoolService;
	
	@PostMapping("/add")
	public Result add(@RequestBody School school) {
		return this.schoolService.add(school);
	}
	
	@GetMapping("/getall")
	public DataResult<List<School>> getAll() {
		return this.schoolService.getAll();
	}

	@GetMapping("getByCVId")
	public DataResult<List<School>> getByCVId(@RequestParam int id) {
		return this.schoolService.getByCVId(id);
	}
}

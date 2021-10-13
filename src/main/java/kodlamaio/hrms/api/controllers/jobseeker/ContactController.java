package kodlamaio.hrms.api.controllers.jobseeker;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.jobseeker.ContactService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.entities.concretes.jobseeker.Contact;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {
	
	@Autowired
	private ContactService contactSerivce;
	
	
	@PostMapping("/add")
	public Result add(@Valid @RequestBody Contact cantact) {
		return this.contactSerivce.add(cantact);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Contact>> getAll() {
		return this.contactSerivce.getAll();
	}
	
	@GetMapping("/getByCurriculumVitae_id")
	public DataResult<List<Contact>> getByCurriculumVitae_id(@RequestParam int curriculumVitaeId) {
		return this.contactSerivce.getByCurriculumVitae_id(curriculumVitaeId);
	}


}

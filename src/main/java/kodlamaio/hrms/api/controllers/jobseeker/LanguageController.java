package kodlamaio.hrms.api.controllers.jobseeker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.jobseeker.LanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.jobseeker.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {
	
	@Autowired
	private LanguageService languageService;
	
	@PostMapping("/add")
	public Result add(@RequestBody Language language) {
		return this.languageService.add(language);
	}
	
	
	
	@GetMapping("/getll")
	public DataResult<List<Language>> getAll() {
		return this.languageService.getAll();
	}
	
	@GetMapping("getByCurriculumVitaeId")
	public DataResult<List<Language>> getByCurriculumVitaeId(@RequestParam int curriculumVitaeId) {
		return this.languageService.getByCurriculumVitaeId(curriculumVitaeId);
	}


}

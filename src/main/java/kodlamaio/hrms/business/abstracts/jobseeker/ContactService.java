package kodlamaio.hrms.business.abstracts.jobseeker;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.jobseeker.Contact;

public interface ContactService {

	Result add(Contact contact);
	DataResult<List<Contact>> getAll();
	DataResult<List<Contact>> getByCurriculumVitae_id(int curriculumVitaeId);
}

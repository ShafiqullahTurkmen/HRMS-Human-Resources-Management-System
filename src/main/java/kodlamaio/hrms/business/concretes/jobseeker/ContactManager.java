package kodlamaio.hrms.business.concretes.jobseeker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.jobseeker.ContactService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.jobseeker.ContactDao;
import kodlamaio.hrms.entities.concretes.jobseeker.Contact;

@Service
public class ContactManager implements ContactService{
	
	@Autowired
	private ContactDao contactDao;

	@Override
	public Result add(Contact contact) {
		this.contactDao.save(contact);
		return new SuccessResult("İletişim bilgileri eklendi.");
	}

	@Override
	public DataResult<List<Contact>> getAll() {
		return new SuccessDataResult<List<Contact>>(this.contactDao.findAll(), "Tüm İletişim bilgileri sıralandi.");
	}

	@Override
	public DataResult<List<Contact>> getByCurriculumVitae_id(int curriculumVitaeId) {
		
		return new SuccessDataResult<List<Contact>>(this.contactDao.findByCurriculumVitae_id(curriculumVitaeId),"CV'nin id'ye göre siralandi.");
	}

}

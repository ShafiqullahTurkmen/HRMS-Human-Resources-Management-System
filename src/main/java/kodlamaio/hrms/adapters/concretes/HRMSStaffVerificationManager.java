package kodlamaio.hrms.adapters.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.adapters.abstracts.HRMSStaffVerificationService;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class HRMSStaffVerificationManager implements HRMSStaffVerificationService{

	@Override
	public boolean isVerifiedEmployerByStaff(Employer employer) {
		return true;
	}

}

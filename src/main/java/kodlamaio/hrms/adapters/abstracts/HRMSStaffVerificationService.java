package kodlamaio.hrms.adapters.abstracts;

import kodlamaio.hrms.entities.concretes.Employer;

public interface HRMSStaffVerificationService {
	boolean isVerifiedEmployerByStaff(Employer employer);
}

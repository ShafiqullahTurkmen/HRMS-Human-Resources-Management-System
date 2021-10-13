package kodlamaio.hrms.adapters.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.adapters.abstracts.EmailVerificationService;

@Service
public class EmailVerificationManager implements EmailVerificationService {

	@Override
	public boolean isEmailVerified(String email) {
		return true;
	}

}

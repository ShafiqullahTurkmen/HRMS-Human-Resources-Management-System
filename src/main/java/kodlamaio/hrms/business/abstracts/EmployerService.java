package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.concretes.dtos.EmployerDto;

public interface EmployerService {

	DataResult<List<EmployerDto>> getAll();
	Result add(Employer employer);
	DataResult<EmployerDto> getById(int employerId);
}

package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.concretes.dtos.EmployerDto;

public interface EmployerDao extends JpaRepository<Employer, Integer>{
	boolean existsByEmail(String email);
	
	@Query("Select new kodlamaio.hrms.entities.concretes.dtos.EmployerDto(e.id, e.companyName, e.website, e.telephone, e.email) From Employer e")
	List<EmployerDto> getAll();
	
	@Query("Select new kodlamaio.hrms.entities.concretes.dtos.EmployerDto(e.id, e.companyName, e.website, e.telephone, e.email) From Employer e where e.id=:employerId")
	EmployerDto getById(int employerId);
	
	
	
}

package kodlamaio.hrms.dataAccess.abstracts.jobseeker;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.dtos.JobSeekerDto;
import kodlamaio.hrms.entities.concretes.jobseeker.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer>{
	boolean existsByIdentityNumber(String indentityNumber);
	boolean existsByEmail(String email);
	
	
	JobSeeker getById(int jobSeekerid);
	
	@Query("Select new kodlamaio.hrms.entities.concretes.dtos.JobSeekerDto(j.id, j.firstName, j.lastName, j.identityNumber, j.email, j.dateOfBirth) From JobSeeker j")
	List<JobSeekerDto> getAll();
	
	@Query("Select new kodlamaio.hrms.entities.concretes.dtos.JobSeekerDto(j.id, j.firstName, j.lastName, j.identityNumber, j.email, j.dateOfBirth) From JobSeeker j where j.id=:jobSeekerId")
	JobSeekerDto getByJobSeekerId(int jobSeekerId);
	
	
}

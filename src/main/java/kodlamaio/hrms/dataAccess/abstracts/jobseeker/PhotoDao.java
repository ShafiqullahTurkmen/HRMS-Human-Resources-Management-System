package kodlamaio.hrms.dataAccess.abstracts.jobseeker;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.jobseeker.Photo;

public interface PhotoDao extends JpaRepository<Photo, Integer>{

}

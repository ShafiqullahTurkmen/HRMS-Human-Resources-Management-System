package kodlamaio.hrms.api.controllers.jobseeker;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.adapters.abstracts.PhotoUploadService;
import kodlamaio.hrms.business.abstracts.jobseeker.PhotoService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.jobseeker.CurriculumVitae;
import kodlamaio.hrms.entities.concretes.jobseeker.Photo;

@RestController
@RequestMapping("/api/photos")
public class PhotoController {
	
	private PhotoService photoService;
	private PhotoUploadService photoUploadService;
	
	@Autowired
	public PhotoController(PhotoService photoService, PhotoUploadService photoUploadService) {
		super();
		this.photoService = photoService;
		this.photoUploadService = photoUploadService;
	}
	

	@PostMapping("/uploadPhotoToCloudAndAddItsUrlToDataBase")
	public Result upload(@RequestParam String PhotoLocation, @RequestParam int CVId) throws IOException {
		String url = photoUploadService.uploadPhotoToCloud(PhotoLocation);
		Photo photo = new Photo();
		CurriculumVitae cv = new CurriculumVitae();
		cv.setId(CVId);
		photo.setCurriculumVitae(cv);
		photo.setUrl(url);
		
		return  photoService.add(photo);
	}
	
	/*
	 * @PostMapping("/addPhotoUrlFromCloud") public Result add(@RequestBody Photo
	 * photo) {
	 * 
	 * }
	 */
	
	
}

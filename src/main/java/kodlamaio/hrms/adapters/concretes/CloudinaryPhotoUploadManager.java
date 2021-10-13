package kodlamaio.hrms.adapters.concretes;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.cloudinary.*;
import com.cloudinary.utils.ObjectUtils;
import kodlamaio.hrms.adapters.abstracts.PhotoUploadService;

@Service
public class CloudinaryPhotoUploadManager implements PhotoUploadService{
	
	private Cloudinary cloudinary;
	private String url;
	
	public CloudinaryPhotoUploadManager() {
		super();
		this.cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "sheff",
				"api_key", "638959169622732",
				"api_secret", "WZdqXP-uMR8fxIShIP07aoMWeUQ",
				"secure", true));
	}

	

	@Override
	public String uploadPhotoToCloud(String photoLocation) throws IOException {
		 File file = new File(photoLocation);
		 Map uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
		 
		 String url = (String) uploadResult.get("url");
		 
		 return url;
	}






}

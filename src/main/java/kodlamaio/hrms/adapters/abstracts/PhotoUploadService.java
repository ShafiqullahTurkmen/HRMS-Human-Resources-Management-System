package kodlamaio.hrms.adapters.abstracts;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface PhotoUploadService {
	 String uploadPhotoToCloud(String photoLocation) throws IOException;
}

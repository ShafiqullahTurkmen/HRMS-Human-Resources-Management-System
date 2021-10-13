package kodlamaio.hrms.entities.concretes.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekerDto {

	private int id;
	private String firstName;
	private String lastName;
	private String identityNumber;
	private String Email;
	private LocalDate dateOfBirth;

}

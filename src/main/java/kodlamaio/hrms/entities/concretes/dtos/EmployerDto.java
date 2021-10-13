package kodlamaio.hrms.entities.concretes.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployerDto {

	private int id;
	private String companyName;
	private String website;
	private String telephone;
	private String email;
}

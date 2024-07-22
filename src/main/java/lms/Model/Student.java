package lms.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Document(collection = "studentData")
public class Student {
	
	
	private int index;
	private String firstName;
	private String lastName;
}

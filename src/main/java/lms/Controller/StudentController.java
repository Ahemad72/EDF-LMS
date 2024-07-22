package lms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lms.Model.Student;
import lms.Repository.SearchRepository;
import lms.Repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	SearchRepository searchRepository;
		
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		
		return studentRepository.findAll();
	}
	
	@GetMapping("/student/{index}")
	public List<Student> searchStudent(@PathVariable Integer index){
		return searchRepository.findByIndex(index);
	}
	
	@PostMapping("/addstudent")
	public String addStudent(@RequestBody Student student) {
		studentRepository.save(student);
		return "Successfully added";
	}
}

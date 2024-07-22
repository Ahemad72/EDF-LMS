package lms.Repository;

import java.util.List;

import org.springframework.stereotype.Component;

import lms.Model.Student;

@Component
public class SearchRepositoryImpl implements SearchRepository {
	
	@Override
	public List<Student> findByIndex(Integer index) {
		return null;
	}
}

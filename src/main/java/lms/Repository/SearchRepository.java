package lms.Repository;

import java.util.List;

import lms.Model.Student;

public interface SearchRepository {
	List<Student> findByIndex(Integer index);
}

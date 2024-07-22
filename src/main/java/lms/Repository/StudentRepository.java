package lms.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import lms.Model.Student;

public interface StudentRepository extends MongoRepository<Student, ObjectId>{

}

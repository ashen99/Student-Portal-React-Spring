package com.ashen.studentportal.repository;

import com.ashen.studentportal.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
}

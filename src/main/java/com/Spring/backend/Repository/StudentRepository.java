package com.Spring.backend.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Spring.backend.Entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}

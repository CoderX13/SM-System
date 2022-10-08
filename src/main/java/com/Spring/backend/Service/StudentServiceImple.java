package com.Spring.backend.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.backend.Entity.Student;
import com.Spring.backend.Repository.StudentRepository;

@Service
public class StudentServiceImple implements StudentService {

	@Autowired
	private StudentRepository studentRepo;

	public StudentServiceImple(StudentRepository studentRepo) {
		this.studentRepo = studentRepo;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<>();
		studentRepo.findAll().forEach(students1 -> students.add(students1));
		return students;
	}

	@Override
	public Student getStudentById(int studentId) {

		return studentRepo.findById(studentId).get();
	}

	@Override
	public void saveOrUpdateStudents(Student student) {
		studentRepo.save(student);

	}

	@Override
	public void deleteStudent(int studentId) {
		studentRepo.deleteById(studentId);

	}

	@Override
	public void updateStudent(Student student, int studentId) {
		studentRepo.save(student);

	}

}

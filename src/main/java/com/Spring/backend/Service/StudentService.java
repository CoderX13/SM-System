package com.Spring.backend.Service;

import java.util.List;

import com.Spring.backend.Entity.Student;

public interface StudentService {

	public List<Student> getAllStudents();

	public Student getStudentById(int studentId);

	public void saveOrUpdateStudents(Student student);

	public void deleteStudent(int studentId);

	public void updateStudent(Student student, int studentId);
}

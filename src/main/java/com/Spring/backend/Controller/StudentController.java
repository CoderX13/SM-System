package com.Spring.backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.backend.Entity.Student;
import com.Spring.backend.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentServ;

	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return studentServ.getAllStudents();
	}

	@GetMapping("/student/{studentId}")
	public Student getStudentById(@PathVariable("studentId") int studentId) {
		return studentServ.getStudentById(studentId);
	}

	@DeleteMapping("/student/{studentId}")
	public void deleteStudentById(@PathVariable("studentId") int studentId) {
		studentServ.deleteStudent(studentId);
	}

	@PostMapping("/student")
	public int saveStudent(@RequestBody Student student) {
		studentServ.saveOrUpdateStudents(student);
		return student.getStudentId();
	}

	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student) {
		studentServ.saveOrUpdateStudents(student);
		return student;
	}

}

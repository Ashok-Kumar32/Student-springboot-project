package com.example.Student.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.Entity.Student;
import com.example.Student.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/all-students")
	public ResponseEntity<List<Student>> listOfStudent() {
		List<Student> studentList = service.listOfStudent();
		return ResponseEntity.status(HttpStatus.OK).body(studentList);
	}

	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable int id) {
		Student std = service.getStudent(id);
		return ResponseEntity.status(HttpStatus.OK).body(std);
	}

	@PostMapping("/add-new")
	public ResponseEntity<Student> addNewSttudent(@RequestBody Student s) {
		Student std = service.addNewStudent(s);
		return ResponseEntity.status(HttpStatus.OK).body(std);
	}

	@PutMapping("/students/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable int id, @RequestBody Student s) {
		s.setId(id);
		Student s1 = service.addNewStudent(s);
		return ResponseEntity.status(HttpStatus.OK).body(s1);

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStudentById(@PathVariable int id) {
		service.deleteById(id);
		return ResponseEntity.ok("deleted succesfully");

	}

}

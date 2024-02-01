package com.example.Student.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student.Entity.Student;
import com.example.Student.Repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;
	
	public List<Student> listOfStudent(){
		return repo.findAll();
	}
	
	public Student getStudent(int id) {
		return repo.findById(id);
	}
	
	public Student addNewStudent(Student s) {
		return repo.save(s);
	}
	
	public Student updateStudent(int id) {
		Student s = repo.findById(id);
		return s;
	}
	
	public Student save(Student s) {
		return repo.save(s);
	}
	
	public void deleteById(int id) {
		repo.deleteById(id);
	}
}

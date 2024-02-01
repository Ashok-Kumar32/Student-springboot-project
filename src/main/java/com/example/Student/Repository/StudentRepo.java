package com.example.Student.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	public Student findById(int id);
	
	
}

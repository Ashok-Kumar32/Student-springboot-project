package com.example.Student.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="frist_name")
	private String fristName;
	
	@Column(name="last_name")
	private String lastName;
	
	private int age;
	
	private String state;
	
	//default constructor
	public Student() {
		super();
	}

	// parameterized constructor
	public Student(int id, String fristName, String lastName, int age, String state) {
		super();
		this.id = id;
		this.fristName = fristName;
		this.lastName = lastName;
		this.age = age;
		this.state = state;
	}

	//getter and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	
	
	
	
	
}

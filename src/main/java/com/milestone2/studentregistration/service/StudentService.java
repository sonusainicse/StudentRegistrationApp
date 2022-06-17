package com.milestone2.studentregistration.service;

import java.util.List;

import com.milestone2.studentregistration.model.Student;


public interface StudentService {
	
Student saveStudent(Student student);
	
	List<Student> getAllStudents();
	
	Student getStudentById(long id);
	
	void deleteStudentById(long id);

}

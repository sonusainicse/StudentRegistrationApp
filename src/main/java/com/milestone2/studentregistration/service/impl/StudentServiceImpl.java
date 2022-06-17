package com.milestone2.studentregistration.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.milestone2.studentregistration.model.Student;
import com.milestone2.studentregistration.repository.StudentRepository;
import com.milestone2.studentregistration.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
private	StudentRepository studentRepository ;

	public StudentServiceImpl(StudentRepository studentRepository) {
	super();
	this.studentRepository = studentRepository;
}
	@Override
   	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		
		 return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(long id) {
		java.util.Optional<Student> optional = studentRepository.findById(id);
		Student student = null;
		if (optional.isPresent()) {
			student = optional.get();
		} else {
			throw new RuntimeException(" Student not found for id :: " + id);
		}
		return student;
	}

	@Override
	public void deleteStudentById(long id) {
		this.studentRepository.deleteById(id);
	}


}

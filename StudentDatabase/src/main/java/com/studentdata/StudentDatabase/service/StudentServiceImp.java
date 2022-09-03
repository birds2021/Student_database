package com.studentdata.StudentDatabase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentdata.StudentDatabase.model.Student;
import com.studentdata.StudentDatabase.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService {

	
	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	
	
}

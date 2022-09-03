package com.studentdata.StudentDatabase.service;

import java.util.List;

import com.studentdata.StudentDatabase.model.Student;

public interface StudentService {

	public Student saveStudent(Student student);
	
	public List<Student> getAllStudent();
}

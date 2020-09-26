package com.gk.service;

import com.gk.dto.Student;

public interface StudentService {

	public String addStudent(Student student);
	
	public Student getStudent(String sid);
	
	public String updateStudent(Student student);
	
	public String deleteStudent(String sid);
}

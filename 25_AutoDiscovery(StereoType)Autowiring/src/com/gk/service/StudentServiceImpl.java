package com.gk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.dao.StudentDAO;
import com.gk.dto.Student;

@Service(value = "studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDao;
	
	@Override
	public String addStudent(Student student) {
	
		String status=studentDao.add(student);
		return status;
	}

	@Override
	public Student getStudent(String sid) {
		
		Student student=studentDao.get(sid);
		return student;
	}

	

	@Override
	public String updateStudent(Student student) {
		
		String status=studentDao.update(student);
		return status;
	}

	@Override
	public String deleteStudent(String sid) {
		String status=studentDao.delete(sid);
		return status;
	}

}

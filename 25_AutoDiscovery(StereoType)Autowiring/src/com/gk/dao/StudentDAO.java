package com.gk.dao;

import com.gk.dto.Student;

public interface StudentDAO {

	public String add(Student student);
	
	public Student get(String sid);
	
	public String update(Student student);
	
	public String delete(String sid);
}

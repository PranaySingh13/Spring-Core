package com.gk.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.gk.dto.Student;
import com.gk.service.StudentService;

@Controller(value = "studentController")
public class StudentControllerImpl implements StudentController {

	BufferedReader br = null;

	@Autowired
	private StudentService studentService;
	/*
	 It is not necessary to use the same name provided in the
	 @Service in the StudentServiceImpl because the @Autowired annotation internally works 
	 on byType autowiring.
	 */

	//For whenever the StudentControllerImpl object is created, the BufferedReader Object is created.
	public StudentControllerImpl() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addStudent() {
		try {
			//First Ask for Enter the Student Details from User
			System.out.print("Student Id : ");
			String sid = br.readLine();
			System.out.print("Student Name: ");
			String sname = br.readLine();
			System.out.print("Student Address: ");
			String saddr = br.readLine();

			//Passing the Student Details in the new Student Object
			Student student = new Student();
			student.setSid(sid);
			student.setSname(sname);
			student.setSaddr(saddr);

			//Now Controller will call the Service Class for Student and pass the student object.
			String status = studentService.addStudent(student);
			
			if(status.equals("existed")) {
				System.out.println("Student Existed Already");
			}
			if(status.equals("success")) {
				System.out.println("Student Insertion Success");
			}
			if(status.equals("failure")) {
				System.out.println("Student Insertion Failure");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void getStudent() {

		try {
			//First Get the Student Id from the User
			System.out.print("Student Id: ");
			String sid=br.readLine();
			//Search the Student Object
			Student student=studentService.getStudent(sid);
			
			if(student==null) {
				System.out.println("Student Not Existed");
			}
			else {
				System.out.println("Student Details");
				System.out.println("---------------");
				System.out.println("Student Id: "+student.getSid());
				System.out.println("Student Name: "+student.getSname());
				System.out.println("Student Address: "+student.getSaddr());
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateStudent() {
		try {
			//First Get the Student id
			System.out.print("Student Id: ");
			String sid=br.readLine();
			//Get the Student Object
			Student student=studentService.getStudent(sid);
			
			if(student==null) {
				System.out.println("Student Not Existed");
			}
			else{
				//Now ask the user for new values
				System.out.println("Student Id: "+student.getSid());
				System.out.print("Student Name Old value: "+student.getSname()+" New Value: ");
				String sname=br.readLine();
				System.out.print("Student Address Old value: "+student.getSaddr()+" New Value: ");
				String saddr=br.readLine();
				
				//setting the new values
				student.setSname(sname);
				student.setSaddr(saddr);
				
				//calling the update method
				String status=studentService.updateStudent(student);
				if(status.equals("success")) {
					System.out.println("Student Updation Success");
				}
				else {
					System.out.println("Student Updation Failure");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteStudent() {

		try {
			System.out.print("Student Id: ");
			String sid=br.readLine();
			String status =studentService.deleteStudent(sid);
			if(status.equals("success")) {
				System.out.println("Student Deletion Success");
			}
			if(status.equals("failure")) {
				System.out.println("Student Deletion Failure");
			}
			if(status.equals("notexisted")) {
				System.out.println("Student Not Existed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

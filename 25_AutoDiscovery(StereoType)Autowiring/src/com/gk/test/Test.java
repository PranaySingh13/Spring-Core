package com.gk.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.controller.StudentController;

public class Test {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/gk/resources/applicationContext.xml");
		StudentController studentController = (StudentController) context.getBean("studentController");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("1. ADD");
			System.out.println("2. SEARCH");
			System.out.println("3. UPDATE");
			System.out.println("4. DELETE");
			System.out.println("5. EXIT");
			System.out.print("Your Options[1,2,3,4,5] : ");
			int option = Integer.parseInt(br.readLine());

			switch (option) {
			case 1:
				studentController.addStudent();
				break;
			case 2:
				studentController.getStudent();
				break;
			case 3:
				studentController.updateStudent();
				break;
			case 4:
				studentController.deleteStudent();
				break;
			case 5:
				System.out.println("******Thank You for using this application******");
				System.exit(0);//Terminate from the Total Program
				break;
			default:
				System.out.println("Enter the Option from 1,2,3,4 & 5 :");
				break;
				
			}
		}
	}

}

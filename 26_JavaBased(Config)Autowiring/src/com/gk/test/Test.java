package com.gk.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gk.config.AccountConfig;
import com.gk.controller.AccountController;

public class Test {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new AnnotationConfigApplicationContext(AccountConfig.class);
		AccountController accController = (AccountController) context.getBean("accController");
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
				accController.addAccount();
				break;
			case 2:
				accController.getAccount();
				break;
			case 3:
				accController.updateAccount();
				break;
			case 4:
				accController.deleteAccount();
				break;
			case 5:
				System.out.println("******Thank You for using this application******");
				System.exit(0);// Terminate from the Total Program
				break;
			default:
				System.out.println("Enter the Option from 1,2,3,4 & 5 :");
				break;

			}

		}
	}

}

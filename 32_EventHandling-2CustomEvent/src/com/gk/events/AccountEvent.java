package com.gk.events;

import java.io.FileOutputStream;
import java.util.Date;

import org.springframework.context.ApplicationEvent;

public class AccountEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String message;

	private static FileOutputStream fos;
	static {
		try {
			fos=new FileOutputStream("F:/Corporate JAVA/logs/log.txt",true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public AccountEvent(Object source, String message) {
		// For Accessing the super class object parameterized constructor
		super(source);
		this.message = message;
	}

	public void generateLog() {
		try {
			message=new Date().toString()+" : "+message;
			message=message+"\n";
			byte b[]=message.getBytes();
			fos.write(b);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package com.gk.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class DatabaseBean {

	private String driverClass;
	private String driverURL;
	private String dbUserName;
	private String dbPassword;

	public String getDriverClass() {
		return driverClass;
	}

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	public String getDriverURL() {
		return driverURL;
	}

	public void setDriverURL(String driverURL) {
		this.driverURL = driverURL;
	}

	public String getDbUserName() {
		return dbUserName;
	}

	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	public void displayDatabaseDetails() {

		System.out.println("DataBase Details");
		System.out.println("----------------");
		System.out.println("Driver Class: " + driverClass);
		System.out.println("Driver URL: " + driverURL);
		System.out.println("Driver Username: " + dbUserName);
		System.out.println("Driver Password: " + dbPassword);
	}

	public void listTables() {
		try {
			Class.forName(driverClass);
			Connection con = DriverManager.getConnection(driverURL, dbUserName, dbPassword);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from category");
			ResultSetMetaData md = rs.getMetaData();
			int columns = md.getColumnCount();
			for (int i = 1; i <= columns; i++) {
				System.out.print(md.getColumnName(i) + "\t");
			}
			System.out.println();
			System.out.println("---------------------------------");
			while (rs.next()) {
				for (int i = 1; i <= columns; i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

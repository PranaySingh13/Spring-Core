package com.gk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gk.dto.Student;
import com.mysql.cj.jdbc.MysqlDataSource;

//@Component(value = "studentDao") We can use any one of the annotation
@Repository(value = "studentDao")
public class StudentDAOImpl implements StudentDAO {

	@Autowired(required = true)
	private MysqlDataSource dataSource; 
	
	@Override
	public String add(Student student) {
		String status="";
		try {
			Connection con=dataSource.getConnection();
			PreparedStatement pst=con.prepareStatement("Select * from STUDENT where SID = ?");
			pst.setString(1,student.getSid());
			ResultSet rs=pst.executeQuery();
			//It will search whether the record is available or not
			boolean b=rs.next();
			//If Student is existed
			if(b==true) {
				status="existed";
			}
			//When Student is not existed
			else {
				pst=con.prepareStatement("insert into STUDENT values(?,?,?)");
				pst.setString(1,student.getSid());
				pst.setString(2,student.getSname());
				pst.setString(3,student.getSaddr());
				
				int rowCount=pst.executeUpdate();
				
				//If rowCount increases on executing update
				if(rowCount==1) {
					status="success";
				}
				else {
					status="failure";
				}
			}
		} catch (Exception e) {
			status="failure";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Student get(String sid) {
		Student student=null;
		try {
			Connection con=dataSource.getConnection();
			PreparedStatement pst=con.prepareStatement("Select * from STUDENT Where SID = ?");
			pst.setString(1,sid);
			ResultSet rs=pst.executeQuery();
			boolean b=rs.next();
			
			//If Student is existed
			if(b==true) {
				student=new Student();
				student.setSid(rs.getString("SID"));
				student.setSname(rs.getString("SNAME"));
				student.setSaddr(rs.getString("SADDR"));
			}
			else {
				student=null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public String update(Student student) {
		String status=null;
		try {
			Connection con=dataSource.getConnection();
			PreparedStatement pst=con.prepareStatement("update STUDENT set SNAME = ? , SADDR = ? where SID = ?");
			pst.setString(1,student.getSname());
			pst.setString(2, student.getSaddr());
			pst.setString(3,student.getSid());
			int rowCount=pst.executeUpdate();
			if(rowCount == 1) {
				status="success";
			}
			else {
				status="failure";
			}
		} catch (Exception e) {
			status="failure";
			e.printStackTrace();
		}
		
		return status;
	}

	@Override
	public String delete(String sid) {
		String status="";
		try {
			Connection con=dataSource.getConnection();
			PreparedStatement pst=con.prepareStatement("Select * from STUDENT where SID = ?");
			pst.setString(1,sid);
			ResultSet rs=pst.executeQuery();
			boolean b=rs.next();
			if(b==true) {
				pst=con.prepareStatement("delete from STUDENT where SID = ?");
				pst.setString(1,sid);
				int rowCount=pst.executeUpdate();
				if(rowCount==1) {
					status="success";
				}
				else {
					status="failure";
				}
			}
			else {
				status="notexisted";
			}
		} catch (Exception e) {
			status="failure";
			e.printStackTrace();
		}
		return status;
	}

}

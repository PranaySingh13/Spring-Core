package com.gk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gk.dto.Account;
import com.mysql.cj.jdbc.MysqlDataSource;

@Repository(value = "accountDao")
public class AccountDAOImpl implements AccountDAO {

	@Autowired
	private MysqlDataSource dataSource;

	@Override
	public String add(Account account) {
		String status = "";

		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("Select * from ACCOUNT where ACCID = ?");
			pst.setInt(1, account.getAccId());
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if (b == true) {
				status = "existed";
			} else {
				pst = con.prepareStatement("insert into ACCOUNT values(?,?,?,?)");
				pst.setInt(1, account.getAccId());
				pst.setString(2, account.getAccName());
				pst.setString(3, account.getAccType());
				pst.setInt(4, account.getAccBalance());
				int rowCount = pst.executeUpdate();
				if (rowCount == 1) {
					status = "success";
				} else {
					status = "failure";
				}
			}
		} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Account get(int accId) {
		Account account = null;
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("Select * from ACCOUNT where ACCID = ?");
			pst.setInt(1, accId);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if (b == true) {
				account = new Account();
				/*
				 * account.setAccId(rs.getInt(1)); account.setAccName(rs.getString(2));
				 * account.setAccType(rs.getString(3)); account.setAccBalance(rs.getInt(4));
				 *
				 * Both are same as ResultSet get method provide the liberty to search either
				 * from columnIndex or columnName
				 */
				account.setAccId(rs.getInt("accId"));
				account.setAccName(rs.getString("accName"));
				account.setAccType(rs.getString("accType"));
				account.setAccBalance(rs.getInt("accBalance"));

			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return account;
	}

	@Override
	public String update(Account account) {
		String status = "";
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con
					.prepareStatement("update ACCOUNT set ACCNAME = ? , ACCBALANCE = ? where ACCID = ?");
			pst.setString(1, account.getAccName());
			pst.setInt(2, account.getAccBalance());
			pst.setInt(3, account.getAccId());
			int rowCount = pst.executeUpdate();
			if (rowCount == 1) {
				status = "success";
			} else {
				status = "failure";
			}
		} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public String delete(int accId) {
		String status = "";
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from ACCOUNT where ACCID = ?");
			pst.setInt(1, accId);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if (b == true) {
				pst = con.prepareStatement("delete from ACCOUNT where ACCID = ?");
				pst.setInt(1, accId);
				int rowCount = pst.executeUpdate();
				if (rowCount == 1) {
					status = "success";
				} else {
					status = "failure";
				}
			} else {
				status = "notExisted";
			}
		} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		return status;
	}

}

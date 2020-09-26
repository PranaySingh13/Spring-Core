package com.gk.dao;

import com.gk.dto.Account;

public interface AccountDAO {

	public String add(Account account);
	
	public Account get(int accId);
	
	public String update(Account account);
	
	public String delete(int accId);
}

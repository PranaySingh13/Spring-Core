package com.gk.service;

import com.gk.dto.Account;

public interface AccountService {

	public String addAccount(Account account);
	
	public Account getAccount(int accId);
	
	public String updateAccount(Account account);
	
	public String deleteAccount(int accId);
}

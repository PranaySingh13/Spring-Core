package com.gk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.dao.AccountDAO;
import com.gk.dto.Account;

@Service(value = "accountService")
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDAO accountDao;

	@Override
	public String addAccount(Account account) {
		String status = accountDao.add(account);
		return status;
	}

	@Override
	public Account getAccount(int accId) {
		Account account=accountDao.get(accId);
		return account;
	}

	@Override
	public String updateAccount(Account account) {
		String status=accountDao.update(account);
		return status;
	}

	@Override
	public String deleteAccount(int accId) {
		String status=accountDao.delete(accId);
		return status;
	}

}

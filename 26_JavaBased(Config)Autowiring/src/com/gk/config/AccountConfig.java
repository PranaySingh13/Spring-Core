package com.gk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gk.controller.AccountController;
import com.gk.controller.AccountControllerImpl;
import com.gk.dao.AccountDAO;
import com.gk.dao.AccountDAOImpl;
import com.gk.service.AccountService;
import com.gk.service.AccountServiceImpl;
import com.mysql.cj.jdbc.MysqlDataSource;

@Configuration // It indicates that the class can be used by the Spring IoC container as a source of bean definitions.
public class AccountConfig {

	@Bean
	public MysqlDataSource dataSource() {
		MysqlDataSource dataSource = null;
		try {
			dataSource = new MysqlDataSource();
			dataSource.setURL("jdbc:mysql://localhost:3306/springautodiscovery");
			dataSource.setUser("root");
			dataSource.setPassword("root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataSource;
	}

	@Bean
	//Spring IOC will read this methodName as bean name. so provide it in context.getBean() to get account controller object.
	public AccountController accController() {
		AccountController accountController = new AccountControllerImpl();
		return accountController;
	}

	@Bean
	public AccountService accService() {
		AccountService accountService = new AccountServiceImpl();
		return accountService;
	}

	@Bean
	public AccountDAO accDao() {
		AccountDAO accountDao = new AccountDAOImpl();
		return accountDao;
	}
}

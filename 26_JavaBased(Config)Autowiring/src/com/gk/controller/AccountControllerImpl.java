package com.gk.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.gk.dto.Account;
import com.gk.service.AccountService;

@Controller(value = "accountController")
public class AccountControllerImpl implements AccountController {

	BufferedReader br = null;

	@Autowired
	private AccountService accountService;

	public AccountControllerImpl() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addAccount() {
		try {
			System.out.print("Enter the Account Id: ");
			int accId = Integer.parseInt(br.readLine());
			System.out.print("Enter the Account Name: ");
			String accName = br.readLine();
			System.out.print("Enter the Account Type: ");
			String accType = br.readLine();
			System.out.print("Enter the Account Balance: ");
			int accBalance = Integer.parseInt(br.readLine());

			Account account = new Account();
			account.setAccId(accId);
			account.setAccName(accName);
			account.setAccType(accType);
			account.setAccBalance(accBalance);

			String status = accountService.addAccount(account);

			if (status.equals("existed")) {
				System.out.println("Account Existed already");
			}
			if (status.equals("success")) {
				System.out.println("Account Added Successfully");
			}
			if (status.equals("failure")) {
				System.out.println("Account is Not Added. Some Issues are there while adding account");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void getAccount() {
		try {
			System.out.print("Enter the Account Id: ");
			int accId = Integer.parseInt(br.readLine());

			Account account = accountService.getAccount(accId);

			if (account == null) {
				System.out.println("Account Not Existed");
			} else {
				System.out.println("Account Details");
				System.out.println("---------------");
				System.out.println("Account Id: " + account.getAccId());
				System.out.println("Account Name: " + account.getAccName());
				System.out.println("Account Type: " + account.getAccType());
				System.out.println("Account Balance: " + account.getAccBalance());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateAccount() {
		try {
			System.out.print("Enter the Account Id: ");
			int accId = Integer.parseInt(br.readLine());

			Account account = accountService.getAccount(accId);
			if (account == null) {
				System.out.println("Account Not Existed");
			} else {
				System.out.println("Please Enter the Details which You want to update in Account");
				System.out.println("Account Id: " + account.getAccId());
				System.out
						.print("Old Account Name is: " + account.getAccName() + " Please enter the New Account Name: ");
				String accName = br.readLine();
				System.out.println("Account Type is: " + account.getAccType());
				System.out.print("Old Account Balance is: " + account.getAccBalance()
						+ " Please enter the New Account Balance: ");
				int accBalance = Integer.parseInt(br.readLine());

				account.setAccName(accName);
				account.setAccBalance(accBalance);

				String status = accountService.updateAccount(account);

				if (status.equals("success")) {
					System.out.println("Account Updated Successfully");
				} else {
					System.out.println("Account is not Updated. Some Issue while Updating");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteAccount() {
		try {
			System.out.print("Account Id: ");
			int accId = Integer.parseInt(br.readLine());

			String status = accountService.deleteAccount(accId);

			if (status.equals("success")) {
				System.out.println("Account is Deleted Successfully");
			}
			if (status.equals("failure")) {
				System.out.println("Account is not Deleted. Some Issue While Deleting");
			}
			if (status.equals("notExisted")) {
				System.out.println("Account is Not existed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

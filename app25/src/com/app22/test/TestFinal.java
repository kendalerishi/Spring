package com.app22.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app22.config.AccountConfig;
import com.app22.dto.Account;
import com.app22.service.AccountService;

public class TestFinal {

	private static ApplicationContext context;
	
	public static void main(String[] args) throws Exception {
		
		context = new AnnotationConfigApplicationContext(AccountConfig.class);
		AccountService accSer = (AccountService)context.getBean("accService");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("-----------------------------------------------");
			System.out.println("Account Operations Menu");
			System.out.println("1.Create Account");
			System.out.println("2.Search Account");
			System.out.println("3.Update Account");
			System.out.println("4.Delete Account");
			System.out.println("5.Exit");
			System.out.print("Your Option : ");
			int option = Integer.parseInt(br.readLine());
			String status = "";
			String accNo = "", accName = "", accType = "";
			int balance = 0;
			switch(option) {
			case 1:
				System.out.print("Account Number :");
				accNo = br.readLine();
				System.out.print("Account Name :");
				accName = br.readLine();
				System.out.print("Account Type :");
				accType = br.readLine();
				System.out.print("Balance :");
				balance = Integer.parseInt(br.readLine());
				status = accSer.craeteAccount(accNo, accName, accType, balance);
				if(status.equals("success")) {
				System.out.println("Account Created Successfully");
				}
				if(status.equals("failure")){
				System.out.println("Account Creation Failure");
				}
				if(status.equals("existed")) {
				System.out.println("Account Existed Already");
				}
				break;
			case 2:
				System.out.print("Account Number :");
				accNo = br.readLine();
				status = accSer.searchAccount(accNo);
				System.out.println("Account Details :"+status);
				break;
				
				case 3:
				System.out.print("Account Number :");
				accNo = br.readLine();
				Account acc = accSer.getAccount(accNo);
				if(acc == null) {
				System.out.println("Status :Account Does Not Exist");
				}else {
				Account acc_New = new Account();
				acc_New.setAccNo(accNo);
				System.out.print("Account Name : Old Value :"+acc.getAccName()+" 	New Value :");
				String accName_New = br.readLine();
				if(accName_New == null || accName_New.equals("")) {
				acc_New.setAccName(acc.getAccName());
				}else {
				acc_New.setAccName(accName_New);
				}
				System.out.print("Account Type : Old Value :"+acc.getAccType()+" 	New Value :");
				String accType_New = br.readLine();
				if(accType_New == null || accType_New.equals("")) {
				acc_New.setAccType(acc.getAccType());
				}else {
				acc_New.setAccType(accType_New);
				}
				System.out.print("Account Balance : Old Value :"+acc.getBalance()+" 	New Value :");
				String bal = br.readLine();
				if(bal == null || bal.equals("")) {
				acc_New.setBalance(acc.getBalance());
				}else {
				int balance_New = Integer.parseInt(bal);
				acc_New.setBalance(balance_New);
				}
				status = accSer.updateAccount(acc_New.getAccNo(), acc_New.getAccName(), acc_New.getAccType(), acc_New.getBalance());
				if(status.equals("success")) {
				System.out.println("Account Updated Successfully");
				}
				if(status.equals("failure")) {
				System.out.println("Account Updation Failure");
				}
				}
				break;
				case 4:
				System.out.print("Account Number :");
				accNo = br.readLine();
				status = accSer.deleteAccount(accNo);
				if(status.equals("success")) {
				System.out.println("Account Deleted Successfully");
				}
				if(status.equals("failure")) {
				System.out.println("Account Deletion Failure");
				}
				if(status.equals("notexisted")) {
				System.out.println("Account Not Existed");
				}
				break;
				case 5:
				System.out.println("***** ThankQ for Using Account Operations App*****");
				System.exit(0);
				break;
				default:
				System.out.println("Enter Number from 1,2,3,4 and 5");
				break;
				}
			}
	}

}

package com.app22.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app22.dao.AccountDao;
import com.app22.dao.AccountDaoImpl;
import com.app22.service.AccountService;
import com.app22.service.AccountServiceImpl;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

@Configuration
public class AccountConfig {

			@Bean
			public MysqlDataSource dataSource() {
				
				MysqlDataSource dataSource =null;
				
				try {
					
					dataSource = new MysqlDataSource();
					dataSource.setURL("jdbc:mysql://localhost/test");
					dataSource.setUser("root");
					dataSource.setPassword("root");
					
				}
				
				catch(Exception e) {
					
					e.printStackTrace();
				}
				
				return dataSource;
			}
	

			@Bean
			public AccountService accService() {
				
				AccountService accService = new AccountServiceImpl();
				return accService;
			}
			
			@Bean
			public AccountDao dao() {
				
				AccountDao dao = new AccountDaoImpl();
				return dao;
			}
}

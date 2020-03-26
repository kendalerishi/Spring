package com.user;

import java.util.ArrayList;
import java.util.List;
import com.login.LoginData;

public class User {
	
	List<LoginData> userList;

	public User()
	{
		userList = new ArrayList<LoginData>();
		userList.add(new LoginData("Ram","Ram"));
		userList.add(new LoginData("Sita","Sita"));
	}

	public List<LoginData> getUserList() {
		return userList;
	}

	public void setUserList(List<LoginData> userList) {
		this.userList = userList;
	}
	
	
}

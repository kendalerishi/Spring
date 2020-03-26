package com.login;

public class LoginData {
	private String Username;
	private String Password;
	
	LoginData()
	{}
	
	public LoginData(String Username, String Password)
	{
		this.Username = Username;
		this.Password = Password;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
}

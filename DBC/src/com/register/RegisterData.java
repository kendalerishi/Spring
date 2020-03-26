package com.register;

public class RegisterData {
	
	private String UserName;
    private String Password;
    private String confirmpass;
    private String Mobile;
    private String email;
    private String dob;
    
    
    public RegisterData() {}
    
	public RegisterData(String userName, String password, String confirmpass, String mobile, String email, String dob) {
		super();
		UserName = userName;
		Password = password;
		this.confirmpass = confirmpass;
		Mobile = mobile;
		this.email = email;
		this.dob = dob;
	}
	
	public String getUserName() { 
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getConfirmpass() {
		return confirmpass;
	}
	public void setConfirmpass(String confirmpass) {
		this.confirmpass = confirmpass;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
}

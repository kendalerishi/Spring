package com.register;

import java.util.ArrayList;
import java.util.List;

public class UserDetails {
	
	List<RegisterData> objUserDetails;
	public UserDetails()
	{
		objUserDetails = new ArrayList<RegisterData>();
		objUserDetails.add(new RegisterData());
		
	}
	public List<RegisterData> getObjUserDetails() {
		return objUserDetails;
	}
	public void setObjUserDetails(List<RegisterData> objUserDetails) {
		this.objUserDetails = objUserDetails;
	}

}

package com.niit.backend.model;
import java.util.*;

public class Login {
	private int loginId;
	private String userEmail;
	private Date loggedOn;
	private Date loggedOut;
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Date getLoggedOn() {
		return loggedOn;
	}
	public void setLoggedOn(Date loggedOn) {
		this.loggedOn = loggedOn;
	}
	public Date getLoggedOut() {
		return loggedOut;
	}
	public void setLoggedOut(Date loggedOut) {
		this.loggedOut = loggedOut;
	}
	

}

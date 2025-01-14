package com.entities;

public class StudentLogin {
	
	private String userName;
	private String loginPassword;
	public StudentLogin() {
		
	}
	public StudentLogin(String userName, String loginPassword) {
		super();
		this.userName = userName;
		this.loginPassword = loginPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	@Override
	public String toString() {
		return "StudentLogin [userName=" + userName + ", loginPassword=" + loginPassword + "]";
	}
	
	
	
	

}

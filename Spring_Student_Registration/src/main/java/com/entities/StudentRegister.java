package com.entities;

public class StudentRegister {
	
	private int studID;
	private String studName;
	private int studAge;
	private String studCity;
	private long studPhone;
	private String studSection;
	private String studEmail;
	private String studPassword;
	private StudentLogin login;
	
	public StudentRegister() {
	
	}

	public StudentRegister(int studID, String studName, int studAge, String studCity, long studPhone,
			String studSection, String studEmail, String studPassword, StudentLogin login) {
		super();
		this.studID = studID;
		this.studName = studName;
		this.studAge = studAge;
		this.studCity = studCity;
		this.studPhone = studPhone;
		this.studSection = studSection;
		this.studEmail = studEmail;
		this.studPassword = studPassword;
		this.login = login;
	}

	public int getStudID() {
		return studID;
	}

	public void setStudID(int studID) {
		this.studID = studID;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getStudAge() {
		return studAge;
	}

	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}

	public String getStudCity() {
		return studCity;
	}

	public void setStudCity(String studCity) {
		this.studCity = studCity;
	}

	public long getStudPhone() {
		return studPhone;
	}

	public void setStudPhone(long studPhone) {
		this.studPhone = studPhone;
	}

	public String getStudSection() {
		return studSection;
	}

	public void setStudSection(String studSection) {
		this.studSection = studSection;
	}

	public String getStudEmail() {
		return studEmail;
	}

	public void setStudEmail(String studEmail) {
		this.studEmail = studEmail;
	}

	public String getStudPassword() {
		return studPassword;
	}

	public void setStudPassword(String studPassword) {
		this.studPassword = studPassword;
	}

	public StudentLogin getLogin() {
		return login;
	}

	public void setLogin(StudentLogin login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return "StudentRegister [studID=" + studID + ", studName=" + studName + ", studAge=" + studAge + ", studCity="
				+ studCity + ", studPhone=" + studPhone + ", studSection=" + studSection + ", studEmail=" + studEmail
				+ ", studPassword=" + studPassword + ", login=" + login + "]";
	}

	

}

package com.entities;

public class ProjectEmployee {
	
	private int empID;
	private String empName;
	private String empRole;
	private int empWorkedProject;
	private int empExperience;
	private ProjectDetails project;
	public ProjectEmployee() {
	
	}
	public ProjectEmployee(int empID, String empName, String empRole, int empWorkedProject, int empExperience,
			ProjectDetails project) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empRole = empRole;
		this.empWorkedProject = empWorkedProject;
		this.empExperience = empExperience;
		this.project = project;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	public int getEmpWorkedProject() {
		return empWorkedProject;
	}
	public void setEmpWorkedProject(int empWorkedProject) {
		this.empWorkedProject = empWorkedProject;
	}
	public int getEmpExperience() {
		return empExperience;
	}
	public void setEmpExperience(int empExperience) {
		this.empExperience = empExperience;
	}
	public ProjectDetails getProject() {
		return project;
	}
	public void setProject(ProjectDetails project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "ProjectEmployee [empID=" + empID + ", empName=" + empName + ", empRole=" + empRole
				+ ", empWorkedProject=" + empWorkedProject + ", empExperience=" + empExperience + ", project=" + project
				+ "]";
	}
	
	


}

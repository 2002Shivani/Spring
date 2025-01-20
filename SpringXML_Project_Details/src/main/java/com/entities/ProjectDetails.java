package com.entities;

public class ProjectDetails {

	private String projectID;
	private String projectDomanin;
	private String projectName;
	private int projectBudget;
	
	public ProjectDetails() {
		
	}

	public ProjectDetails(String projectID, String projectDomanin, String projectName, int projectBudget) {
		super();
		this.projectID = projectID;
		this.projectDomanin = projectDomanin;
		this.projectName = projectName;
		this.projectBudget = projectBudget;
	}

	public String getProjectID() {
		return projectID;
	}

	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}

	public String getProjectDomanin() {
		return projectDomanin;
	}

	public void setProjectDomanin(String projectDomanin) {
		this.projectDomanin = projectDomanin;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getProjectBudget() {
		return projectBudget;
	}

	public void setProjectBudget(int projectBudget) {
		this.projectBudget = projectBudget;
	}

	@Override
	public String toString() {
		return "ProjectDetails [projectID=" + projectID + ", projectDomanin=" + projectDomanin + ", projectName="
				+ projectName + ", projectBudget=" + projectBudget + "]";
	}
	
}

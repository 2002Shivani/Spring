package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DistrictDetails {
	
	@Value("19")
	private int DistrictId;
	private String DistrictName;
	private String DistrictState;
	private int DistrictNH;
	public DistrictDetails() {
		
	}
	public DistrictDetails(int districtId, String districtName, String districtState, int districtNH) {
		super();
		DistrictId = districtId;
		DistrictName = districtName;
		DistrictState = districtState;
		DistrictNH = districtNH;
	}
	public int getDistrictId() {
		return DistrictId;
	}
	public void setDistrictId(int districtId) {
		DistrictId = districtId;
	}
	public String getDistrictName() {
		return DistrictName;
	}
	public void setDistrictName(String districtName) {
		DistrictName = districtName;
	}
	public String getDistrictState() {
		return DistrictState;
	}
	public void setDistrictState(String districtState) {
		DistrictState = districtState;
	}
	public int getDistrictNH() {
		return DistrictNH;
	}
	public void setDistrictNH(int districtNH) {
		DistrictNH = districtNH;
	}
	@Override
	public String toString() {
		return "DistrictDetails [DistrictId=" + DistrictId + ", DistrictName=" + DistrictName + ", DistrictState="
				+ DistrictState + ", DistrictNH=" + DistrictNH + "]";
	}
	
	
	
	
}

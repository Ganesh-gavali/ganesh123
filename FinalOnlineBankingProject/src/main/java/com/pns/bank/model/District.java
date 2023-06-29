package com.pns.bank.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class District {
	@Id
	private int districtId;
	private String districtName;
	
	private int stateId;

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	

	
	
}

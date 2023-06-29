package com.pns.bank.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {
	@Id
	private int cityId;
	private String cityName;
	private int districtId;

	

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	
}

package com.pns.bank.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class State {
	@Id
	private int stateId;
	private String stateName;
	private int countryId;
	
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	

}

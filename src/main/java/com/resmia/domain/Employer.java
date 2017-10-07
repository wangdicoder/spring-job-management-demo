package com.resmia.domain;

import javax.persistence.Entity;

@Entity
public class Employer extends User {
	private String Occupation;

	public Employer(){
	    setUserType("employer");
    }

	public String getOccupation() {
		return Occupation;
	}

	public void setOccupation(String occupation) {
		Occupation = occupation;
	}
}

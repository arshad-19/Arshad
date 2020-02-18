package com.project.entity;

import java.util.List;


public class DiagnosisCentre {
	String centerName;
	String centreId;
	List<CheckUp> tests;
	/**
	 * @param centerName
	 * @param centerId
	 * @param test
	 */
	public DiagnosisCentre(String centerId,String centerName, List<CheckUp> test) {
		super();
		this.centerName = centerName;
		this.centreId = centerId;
		this.tests = test;
	}
	/**
	 * @return the centerName
	 */
	public String getCenterName() {
		return centerName;
	}
	/**
	 * @param centerName the centerName to set
	 */
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	/**
	 * @return the centerId
	 */
	public String getCenterId() {
		return centreId;
	}
	/**
	 * @param centerId the centerId to set
	 */
	public void setCenterId(String centerId) {
		this.centreId = centerId;
	}
	/**
	 * @return the test
	 */
	public List<CheckUp> getTest() {
		return tests;
	}
	/**
	 * @param test the test to set
	 */
	public void setTest(List<CheckUp> tests) {
		this.tests = tests;
	}
		
	
}

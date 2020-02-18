package com.project.entity;

import java.util.List;

public class CheckUp {
	String testName;
	String testId;
	double testPrice;
	List<TestSlot> tslist;
	/**
	 * @param testName
	 * @param testId
	 * @param testPrice
	 * @param tslist
	 */
	public CheckUp(String testId, String testName, double testPrice) {
		super();
		this.testName = testName;
		this.testId = testId;
		this.testPrice = testPrice;
	}
	/**
	 * @return the testName
	 */
	public String getTestName() {
		return testName;
	}
	/**
	 * @param testName the testName to set
	 */
	public void setTestName(String testName) {
		this.testName = testName;
	}
	/**
	 * @return the testId
	 */
	public String getTestId() {
		return testId;
	}
	/**
	 * @param testId the testId to set
	 */
	public void setTestId(String testId) {
		this.testId = testId;
	}
	/**
	 * @return the testPrice
	 */
	public double getTestPrice() {
		return testPrice;
	}
	/**
	 * @param testPrice the testPrice to set
	 */
	public void setTestPrice(double testPrice) {
		this.testPrice = testPrice;
	}
	/**
	 * @return the tslist
	 */
	public List<TestSlot> getTslist() {
		return tslist;
	}
	/**
	 * @param tslist the tslist to set
	 */
	public void setTslist(List<TestSlot> tslist) {
		this.tslist = tslist;
	}
	
	

}

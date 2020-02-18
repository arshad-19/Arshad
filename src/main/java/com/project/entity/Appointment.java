package com.project.entity;

/**
 *@author Arshad Khadari
 *         This Entity of appointment is having the parameters of 
 */

public class Appointment {
    String appointId;
    String testId;
    String centreId;
    String userId;
    long contactNo;
	/****************************************************************************
	 * @param appointId is an appointment id which is will be alloted randomly 
	 * @param testId is Checkup Id 
	 * @param centreId is the centreId allotted to the centres in Repository
	 * @param userId It can predefined in the Repository it should be string
	 * @param contactNo It is long number defined In the code
	 *****************************************************************************/
	public Appointment(String appId, String testId, String centreId, String userId, long contactNo) {
		super();
		this.appointId = appId;
		this.testId = testId;
		this.centreId = centreId;
		this.userId = userId;
		this.contactNo = contactNo;
	}
	/**
	 * @return the appId
	 */
	public String getAppId() {
		return appointId;
	}
	/**
	 * @param appId the appId to set
	 */
	public void setAppId(String appId) {
		this.appointId = appId;
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
	 * @return the centreId
	 */
	public String getCentreId() {
		return centreId;
	}
	/**
	 * @param centreId the centreId to set
	 */
	public void setCentreId(String centreId) {
		this.centreId = centreId;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the contactNo
	 */
	public double getContactNo() {
		return contactNo;
	}
	/**
	 * @param contactNo the contactNo to set
	 */
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
    
	


}

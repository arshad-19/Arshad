package com.project.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestSlot {
    String slotId;
    String testId;
    LocalDate date;
    int numOfApp;
    List<Appointment> applst = new ArrayList<>();
	/**
	 * @param slotId
	 * @param testId
	 * @param date
	 * @param numOfApp
	 * @param applst
	 */
	public TestSlot(String slotId, String testId, LocalDate date, int numOfApp, List<Appointment> applst) {
		super();
		this.slotId = slotId;
		this.testId = testId;
		this.date = date;
		this.numOfApp = numOfApp;
		this.applst = applst;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  slotId +" "+date+" "+testId+" "+numOfApp;
	}
	/**
	 * @return the slotId
	 */
	public String getSlotId() {
		return slotId;
	}
	/**
	 * @param slotId the slotId to set
	 */
	public void setSlotId(String slotId) {
		this.slotId = slotId;
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
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}
	/**
	 * @return the numOfApp
	 */
	public int getNumOfApp() {
		return numOfApp;
	}
	/**
	 * @param numOfApp the numOfApp to set
	 */
	public void setNumOfApp(int numOfApp) {
		this.numOfApp = numOfApp;
	}
	/**
	 * @return the applst
	 */
	public List<Appointment> getApplst() {
		return applst;
	}
	/**
	 * @param applst the applst to set
	 */
	public void setApplst(List<Appointment> applst) {
		this.applst = applst;
	}
	
    
}

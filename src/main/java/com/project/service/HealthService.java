package com.project.service;

import java.time.LocalDate;

import com.project.entity.TestSlot;
import com.project.exception.AppointmentException;
import com.project.exception.CenterException;
import com.project.exception.CheckUpException;
import com.project.exception.ValidateException;

public interface HealthService {

	public TestSlot getSlots(String centreId, String testId, LocalDate ldt)
			throws CenterException, ValidateException, CheckUpException;

	public String makeAppointment(String centreId, String testId, LocalDate ldt, String userName, long contact)
			throws CenterException, ValidateException, AppointmentException, CheckUpException;
}

package com.project.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import com.project.exception.AppointmentException;
import com.project.exception.CenterException;
import com.project.exception.CheckUpException;
import com.project.exception.ValidateException;
import com.project.service.HealthService;
import com.project.service.HealthServiceImpl;

public class AppointmentTest {
	
	@Test
	@DisplayName("Test Case 1")
	public void testAppointment1() throws CenterException, ValidateException, AppointmentException, CheckUpException {
		 HealthService ser = new HealthServiceImpl();
		 assertEquals("Confirmed", ser.makeAppointment("dc1", "1001", LocalDate.of(2020, 02, 20), "arshad", 9855585));
	}

	
    @RepeatedTest(8)
	@Test
	@DisplayName("Test Case 3")
	public void testAppointment3() throws CenterException, ValidateException, AppointmentException, CheckUpException {
		HealthService ser = new HealthServiceImpl();
		assertEquals("Confirmed", ser.makeAppointment("dc1", "1001", LocalDate.of(2020, 02, 20), "arshad", 9855585));
	}

	@Test
	@DisplayName("Test Case 4")
	public void testAppointment4() throws CenterException, ValidateException, AppointmentException {
		HealthService ser = new HealthServiceImpl();
		assertThrows(AppointmentException.class,
				()-> ser.makeAppointment("dc1", "1001", LocalDate.of(2020, 02, 20), "arshad", 9855585));
	}

	@Test
	@DisplayName("Test Case 5")
	public void testAppointment5() throws CenterException, ValidateException, AppointmentException {
		HealthService ser = new HealthServiceImpl();
		assertThrows(ValidateException.class,()-> ser.makeAppointment("Acf", "1001", LocalDate.of(2020, 02, 20), "arshad", 9855585));
	}

}

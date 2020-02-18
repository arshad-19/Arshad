package com.project.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.project.exception.CenterException;
import com.project.exception.SlotException;
import com.project.exception.ValidateException;
import com.project.service.HealthService;
import com.project.service.HealthServiceImpl;

public class SlotsTest {
	
	@Test
	@DisplayName("Test Case 2")
	public void testAppointment2() throws CenterException, ValidateException {
		HealthService ser = new HealthServiceImpl();
		assertThrows(SlotException.class,()->ser.getSlots("dc1", "1009", LocalDate.of(2020, 02, 20)));
	}

}

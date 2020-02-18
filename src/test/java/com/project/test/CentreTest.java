package com.project.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.project.dao.HealthDao;
import com.project.dao.HealthDaoImpl;
import com.project.exception.CenterException;
import com.project.exception.ValidateException;
import com.project.service.HealthService;
import com.project.service.HealthServiceImpl;

public class CentreTest {
	
	@Test
	@DisplayName("Test Case 1")
	public void testAppointment1() throws CenterException, ValidateException {
		HealthDao dao = new HealthDaoImpl();
		assertThrows(CenterException.class,()->dao.getDiagnosticCentre(""));
	}

}

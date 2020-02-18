package com.project.dao;

import java.time.LocalDate;

import com.project.entity.CheckUp;
import com.project.entity.DiagnosisCentre;
import com.project.entity.TestSlot;
import com.project.exception.CenterException;
import com.project.exception.CheckUpException;

public interface HealthDao {
	public DiagnosisCentre getDiagnosticCentre(String centreId) throws CenterException;

	public CheckUp getCheckUpList(String testId, DiagnosisCentre centre) throws CheckUpException;

	public TestSlot getSlots(LocalDate ldt, CheckUp checkup) throws CenterException;
}

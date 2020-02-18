package com.project.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.project.entity.CheckUp;
import com.project.entity.DiagnosisCentre;
import com.project.entity.TestSlot;
import com.project.exception.CenterException;
import com.project.exception.CheckUpException;
import com.project.repo.ProjectRepo;

/********************************************************************
 * @author Arshad Khadari 
 * This class is used for the implementation of Dao layer
 * where it is used for the getting the slots list, centreList and
 * TestId
 */
public class HealthDaoImpl implements HealthDao {
	static Map<String, DiagnosisCentre> dcentres = ProjectRepo.listOfCenters;

	/**
	 * This methods Returns the diagnosis centres from the centreId defined and if
	 * the centreId is not found in the centre Map the it will return the centre of
	 * the given centre id
	 */
	public DiagnosisCentre getDiagnosticCentre(String centreId) throws CenterException {
		if (!dcentres.containsKey(centreId))
			throw new CenterException("No Centre Found");
		return dcentres.get(centreId);
	}

	/**
	 * This methods returns checkup List filtering it wit testId in the checkUpId
	 * and TestId and It checks the checkUp list is empty Or not if Empty it will
	 * return the no test Found or it will return the list
	 */

	public CheckUp getCheckUpList(String testId, DiagnosisCentre centre) throws CheckUpException {
		List<CheckUp> checkUpList = centre.getTest().stream().filter(test -> test.getTestId().equalsIgnoreCase(testId))
				.collect(Collectors.toList());
		if (checkUpList.isEmpty())
			throw new CheckUpException("No Test Found in that Centre");
		return checkUpList.get(0);
	}

	/**
	 * This methods returns the testSlots by checking it based upon the date and
	 * return the list of slots available for the test
	 * 
	 */
	public TestSlot getSlots(LocalDate ldt, CheckUp checkup) throws CenterException {
		List<TestSlot> slots = checkup.getTslist().stream().filter(ts -> ts.getDate().equals(ldt))
				.collect(Collectors.toList());
		if (slots.isEmpty())
			throw new CenterException("Slot Not Found  For The Test");
		return slots.get(0);
	}

}

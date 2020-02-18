package com.project.service;

import java.time.LocalDate;

import com.project.dao.HealthDao;
import com.project.dao.HealthDaoImpl;
import com.project.entity.Appointment;
import com.project.entity.CheckUp;
import com.project.entity.DiagnosisCentre;
import com.project.entity.TestSlot;
import com.project.exception.AppointmentException;
import com.project.exception.CenterException;
import com.project.exception.CheckUpException;
import com.project.exception.ValidateException;

/****************************************************************************************************
 * @author Arshad Khadari
 * 
 *         The HealthServiceImpl class implements the methods getSlots(String
 *         centreId, String testId, LocalDate ldt) and makeAppointment(String
 *         centreId, String testId, LocalDate ldt, String userName, long
 *         contact) of HealthService interface and executes respective
 *         executions
 *****************************************************************************************************/

public class HealthServiceImpl implements HealthService {
	/********************
	 * Create instance for the HealthDao to access the dao methods
	 ********************/
	private HealthDao dao = new HealthDaoImpl();
	/***********************************************************************
	 * Create instance for the uniquegenarator to access the get AppointmentId
	 * randomly
	 ************************************************************************/
	UniqueGenerator obj = new UniqueGenerator();

	/************************************************************************
	 * this methods checks the validation for the centreID by using string matches
	 * by if it matches it will return true or else it will throw an exception
	 ***************************************************************************/

	private boolean validateCentreId(String centreId) throws ValidateException {
		if (!centreId.matches("[0-9a-z]{3}"))
			throw new ValidateException("Invalid Appointment ID");
		return true;
	}

	/************************************************************************
	 * this methods checks the validation for the TestId by using string matches by
	 * if it matches it will return true or else it will throw an exception
	 ***************************************************************************/

	private boolean validateTestId(String TestId) throws ValidateException {
		if (!TestId.matches("[0-9]{4}"))
			throw new ValidateException("Invalid Appointment ID");
		return true;
	}

	@Override
	public TestSlot getSlots(String centreId, String testId, LocalDate ldt) throws CenterException, ValidateException, CheckUpException {
		DiagnosisCentre centre = dao.getDiagnosticCentre(centreId);
		CheckUp checkUp = dao.getCheckUpList(testId, centre);
		if(validateCentreId(centreId) && validateTestId(testId))
		if (checkUp == null)
			throw new CenterException("No Slots For The Test");
			return dao.getSlots(ldt, checkUp);
	}

	/*************************************************************************************
	 * Description:
	 *             This methods adds an appointment for the respective date of the
	 * slots by validating it with respective centreId and testId. 
	 * Method: 
	 *          Making a appointment for the respective centreId and TestId and 
	 * getting the list from the Dao Layer of Appointment then it add it into the 
	 * amptList of the test slots entity
	 *  @params: 
	 *           The parameters are centreId, TestId, Ldt(LocalDate), UserName and 
	 *            Contact no of user 
	 * @returns: 
	 *         This method returns a string of confirmed message that the appointment has been added 
	 *         Successfully     
	 * @throws CenterException, ValidateException, AppontmentException for the respective 
	 * exceptions
	 * @throws CheckUpException 
	 *****************************************************************************************/
	@Override
	public String makeAppointment(String centreId, String testId, LocalDate ldt, String userName, long contact)
			throws CenterException, ValidateException, AppointmentException, CheckUpException {
		if (validateCentreId(centreId) && validateTestId(testId)) {
        /** if the validations has failed the it will throw a validation exception */	
			DiagnosisCentre centre = dao.getDiagnosticCentre(centreId);
			CheckUp checkUp = dao.getCheckUpList(testId, centre);
			TestSlot testSlot = dao.getSlots(ldt, checkUp);
			if (testSlot.getNumOfApp() == 0)  
        /** if the is empty then it will throw an exception that no appointment is found*/
				throw new AppointmentException("Number of appointments have filled");
			testSlot.setNumOfApp(testSlot.getNumOfApp() - 1);
			String set = obj.generateNum("ABCDEFG123456789", 5);
			Appointment app = new Appointment(set, testId, centreId, userName, contact);

			testSlot.getApplst().add(app);
		}
		return "Confirmed" /* + "\n" + "Appointment id:" + set */;
	}

}

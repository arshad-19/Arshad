package com.project.repo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.project.entity.Appointment;
import com.project.entity.CheckUp;
import com.project.entity.DiagnosisCentre;
import com.project.entity.TestSlot;

public class ProjectRepo {
	public static List<Appointment> apmtList = new ArrayList<>();
	public static Map<String, DiagnosisCentre> listOfCenters = new HashMap<>();
	static {
		/** Adding checkUp(tests) in ChList(testList) */
		CheckUp c1 = new CheckUp("1001", "test1", 500.0);
		CheckUp c2 = new CheckUp("1002", "test2", 400.0);
		CheckUp c3 = new CheckUp("1003", "test3", 300.0);
		CheckUp c4 = new CheckUp("1004", "test4", 300.0);
		List<CheckUp> chList = new ArrayList<>();
		chList.add(c1);
		chList.add(c2);
		chList.add(c3);
		chList.add(c4);
		
		
		/** Adding testslots for checkUp 1 */
		TestSlot slot1 = new TestSlot("1", "1001", LocalDate.of(2020, 02, 20), 10, apmtList);
		TestSlot slot2 = new TestSlot("2", "1002", LocalDate.of(2020, 02, 21), 10, apmtList);
		/** Adding testslotslist into checkUp 1 */
		List<TestSlot> slots1 = new ArrayList<>();
		slots1.add(slot1);
		slots1.add(slot2);
		c1.setTslist(slots1);
		
		
		/** Adding testslots for checkUp 2 */
		TestSlot slot3 = new TestSlot("1", "1003", LocalDate.of(2020, 02, 20), 10, apmtList);
		TestSlot slot4 = new TestSlot("2", "1002", LocalDate.of(2020, 02, 21), 10, apmtList);
		/** Adding testslotslist into checkUp 2 */
		List<TestSlot> slots2 = new ArrayList<>();
		slots2.add(slot3);
		slots2.add(slot4);
		c2.setTslist(slots2);

		  /** Adding testslots for checkUp 3 */
		TestSlot slot5 = new TestSlot("1", "1004", LocalDate.of(2020, 02, 20), 10, apmtList);
		TestSlot slot6 = new TestSlot("2", "1002", LocalDate.of(2020, 02, 21), 10, apmtList);
		  /** Adding testslotslist into checkUp 3 */
		List<TestSlot> slots3 = new ArrayList<>();
		slots1.add(slot5);
		slots1.add(slot6);
		c3.setTslist(slots3);

		  /** Adding centres in dcList */
		DiagnosisCentre dc1 = new DiagnosisCentre("dc1", "name1", chList);
		DiagnosisCentre dc2 = new DiagnosisCentre("dc2", "name2", chList);
		DiagnosisCentre dc3 = new DiagnosisCentre("dc3", "name3", chList);
		List<DiagnosisCentre> dcList = new ArrayList<>();
		dcList.add(dc1);
		dcList.add(dc2);
		dcList.add(dc3);
		
		
        /** Adding centres into listOfcentres*/
		listOfCenters.put(dc1.getCenterId(), dc1);
		listOfCenters.put(dc2.getCenterId(), dc2);
		listOfCenters.put(dc3.getCenterId(), dc3);

	}

}

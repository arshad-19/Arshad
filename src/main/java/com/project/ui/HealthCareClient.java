package com.project.ui;

import java.time.LocalDate;
import com.project.entity.TestSlot;
import com.project.exception.AppointmentException;
import com.project.exception.CenterException;
import com.project.exception.CheckUpException;
import com.project.exception.SlotException;
import com.project.exception.ValidateException;
import com.project.service.HealthService;
import com.project.service.HealthServiceImpl;

public class HealthCareClient {
	static HealthService ser = new HealthServiceImpl();
	public static void main(String[] args) {
		try {
			TestSlot testSlot = ser.getSlots("dc2", "1001", LocalDate.of(2020, 02, 21));
			System.out.println(testSlot);
			String res = ser.makeAppointment("dc2", "1001", LocalDate.of(2020, 02, 21), "arshad", 9855585);
			System.out.println(res);
			TestSlot testSlot1 = ser.getSlots("dc2", "1001", LocalDate.of(2020, 02, 21));
			System.out.println(testSlot1);
		} catch (CenterException | ValidateException | AppointmentException | CheckUpException | SlotException e) {
			System.out.println(e.getMessage());
		}
	}

}

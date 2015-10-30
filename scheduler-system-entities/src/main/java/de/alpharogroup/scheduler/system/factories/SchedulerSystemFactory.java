package de.alpharogroup.scheduler.system.factories;

import java.util.Date;

import de.alpharogroup.scheduler.system.entities.Appointments;
import de.alpharogroup.scheduler.system.enums.Rhythm;

public class SchedulerSystemFactory {
	
	private SchedulerSystemFactory() {
	}

	/** The Constant instance. */
	private static final SchedulerSystemFactory instance = new SchedulerSystemFactory();

	public static SchedulerSystemFactory getInstance() {
		return instance;
	}

	/**
	 * Domain object factory for Appointments.
	 *
	 * @param endtime the endtime
	 * @param nexttime the nexttime
	 * @param rhythm the rhythm
	 * @param starttime the starttime
	 * @return AppointmentsA Appointments object
	 */
	public Appointments newAppointments(Date endtime, Date nexttime,
			Rhythm rhythm, Date starttime) {
		Appointments appointments = new Appointments();
		appointments.setEndtime(endtime);
		appointments.setNexttime(nexttime);
		appointments.setRhythm(rhythm);
		appointments.setStarttime(starttime);
		return appointments;
	}
}

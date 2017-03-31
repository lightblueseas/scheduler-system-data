/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *  *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *  *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
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

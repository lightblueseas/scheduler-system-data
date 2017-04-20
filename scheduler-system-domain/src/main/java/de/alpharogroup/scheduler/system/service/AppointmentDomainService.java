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
package de.alpharogroup.scheduler.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.alpharogroup.scheduler.system.daos.AppointmentsDao;
import de.alpharogroup.scheduler.system.domain.Appointment;
import de.alpharogroup.scheduler.system.entities.Appointments;
import de.alpharogroup.scheduler.system.mapper.AppointmentsMapper;
import de.alpharogroup.scheduler.system.service.api.AppointmentService;
import de.alpharogroup.scheduler.system.service.api.AppointmentsService;
import de.alpharogroup.service.domain.AbstractDomainService;
import lombok.Getter;
import lombok.Setter;

@Transactional
@Service("appointmentDomainService")
public class AppointmentDomainService
	extends
		AbstractDomainService<Integer, Appointment, Appointments, AppointmentsDao, AppointmentsMapper>
	implements
		AppointmentService
{

	/** The {@link AppointmentsService}. */
	@Autowired
	@Getter
	@Setter
	private AppointmentsService appointmentsService;

	/**
	 * Sets the specific {@link AppointmentsDao}.
	 *
	 * @param appointmentsDao
	 *            the new {@link AppointmentsDao}.
	 */
	@Autowired
	public void setAppointmentsDao(final AppointmentsDao appointmentsDao)
	{
		setDao(appointmentsDao);
	}

	/**
	 * Sets the specific {@link AppointmentsMapper}.
	 *
	 * @param mapper
	 *            the new {@link AppointmentsMapper}.
	 */
	@Autowired
	public void setAppointmentsMapper(AppointmentsMapper mapper)
	{
		setMapper(mapper);
	}

}

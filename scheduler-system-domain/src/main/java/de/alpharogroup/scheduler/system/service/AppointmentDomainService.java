package de.alpharogroup.scheduler.system.service;

import org.springframework.beans.factory.annotation.Autowired;

import de.alpharogroup.scheduler.system.daos.AppointmentsDao;
import de.alpharogroup.scheduler.system.domain.Appointment;
import de.alpharogroup.scheduler.system.entities.Appointments;
import de.alpharogroup.scheduler.system.mapper.AppointmentsMapper;
import de.alpharogroup.scheduler.system.service.api.AppointmentService;
import de.alpharogroup.scheduler.system.service.api.AppointmentsService;
import de.alpharogroup.service.domain.AbstractDomainService;
import lombok.Getter;
import lombok.Setter;

public class AppointmentDomainService
		extends AbstractDomainService<Integer, Appointment, Appointments, AppointmentsDao, AppointmentsMapper>
		implements AppointmentService {

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
	public void setAppointmentsDao(AppointmentsDao appointmentsDao) {
		setDao(appointmentsDao);
	}
}

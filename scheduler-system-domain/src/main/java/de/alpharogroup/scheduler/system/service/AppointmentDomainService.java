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
	public void setAppointmentsDao(final AppointmentsDao appointmentsDao) {
		setDao(appointmentsDao);
	}
	/**
	 * Sets the specific {@link AppointmentsMapper}.
	 *
	 * @param mapper
	 *            the new {@link AppointmentsMapper}.
	 */
	@Autowired
	public void setAppointmentsMapper(AppointmentsMapper mapper) {
		setMapper(mapper);
	}

}

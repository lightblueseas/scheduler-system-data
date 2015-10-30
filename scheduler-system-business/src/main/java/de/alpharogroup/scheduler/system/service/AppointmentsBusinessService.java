package de.alpharogroup.scheduler.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.alpharogroup.db.service.jpa.AbstractBusinessService;
import de.alpharogroup.scheduler.system.daos.AppointmentsDao;
import de.alpharogroup.scheduler.system.entities.Appointments;
import de.alpharogroup.scheduler.system.service.api.AppointmentsService;

@Transactional
@Service("appointmentsBusinessService")
public class AppointmentsBusinessService extends AbstractBusinessService<Appointments, Integer, AppointmentsDao> implements AppointmentsService {

	/** The serial Version UID */
	private static final long serialVersionUID = 1L;

	@Autowired
	public void setAppointmentsDao(AppointmentsDao appointmentsDao) {
		setDao(appointmentsDao);
	}

}

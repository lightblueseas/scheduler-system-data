package de.alpharogroup.scheduler.system.service.api;

import de.alpharogroup.db.service.jpa.BusinessService;
import de.alpharogroup.scheduler.system.entities.Appointments;

public interface AppointmentsService extends
		BusinessService<Appointments, Integer> {
}

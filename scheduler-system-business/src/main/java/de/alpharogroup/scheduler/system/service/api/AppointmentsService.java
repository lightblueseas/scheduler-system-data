package de.alpharogroup.scheduler.system.service.api;

import de.alpharogroup.db.service.jpa.BusinessService;
import de.alpharogroup.scheduler.system.entities.Appointments;

/**
 * The interface {@link AppointmentsService}.
 */
public interface AppointmentsService extends
		BusinessService<Appointments, Integer> {
}

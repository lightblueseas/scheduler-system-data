package de.alpharogroup.scheduler.system.rest;

import de.alpharogroup.scheduler.system.domain.Appointment;
import de.alpharogroup.scheduler.system.rest.api.AppointmentsResource;
import de.alpharogroup.scheduler.system.service.api.AppointmentService;
import de.alpharogroup.service.rs.AbstractRestfulResource;

public class AppointmentsRestResource
	extends
		AbstractRestfulResource<Integer, Appointment, AppointmentService>
	implements
		AppointmentsResource
{

}

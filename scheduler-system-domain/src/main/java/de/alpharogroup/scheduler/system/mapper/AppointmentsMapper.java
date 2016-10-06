package de.alpharogroup.scheduler.system.mapper;

import org.springframework.stereotype.Component;

import de.alpharogroup.db.entitymapper.AbstractEntityDOMapper;
import de.alpharogroup.scheduler.system.domain.Appointment;
import de.alpharogroup.scheduler.system.entities.Appointments;

/**
 * The class {@link AppointmentsMapper}.
 */
@Component
public class AppointmentsMapper extends AbstractEntityDOMapper<Appointments, Appointment> {

}

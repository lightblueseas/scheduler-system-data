package de.alpharogroup.scheduler.system.domain;

import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import de.alpharogroup.domain.BaseDomainObject;
import de.alpharogroup.scheduler.system.enums.Rhythm;

@Getter
@Setter
@ToString(callSuper=true)
@EqualsAndHashCode(callSuper=true)
public class Appointment extends BaseDomainObject<Integer> {
	/** The serial Version UID */
	private static final long serialVersionUID = 1L;
	/** The last time from the appointment. */
	private Date endtime;
	/** The next time from the apointment. */
	private Date nexttime;
	/** An enum that gives us the rhythm from the appointment. */
	private Rhythm rhythm;
	/** The start time from the appointment. */
	private Date starttime;
}

package de.alpharogroup.scheduler.system.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import de.alpharogroup.db.entity.BaseEntity;
import de.alpharogroup.scheduler.system.enums.Rhythm;


/**
 * The Entity class {@link Appointments} is keeping the information
 * for the appointments from a given event. This can combined for instance with a user
 * address to get an event location with an appointment.
 */
@Entity
@Table(name = "appointments")
@TypeDefs({ @TypeDef(name = "rhythmConverter", typeClass = de.alpharogroup.db.postgres.usertype.PGEnumUserType.class, parameters = { @Parameter(name = "enumClassName", value = "de.alpharogroup.scheduler.system.enums.Rhythm") }) })
@Getter
@Setter
@NoArgsConstructor
public class Appointments 
extends BaseEntity<Integer>
 implements Cloneable {
	/** The serial Version UID */
	private static final long serialVersionUID = 1L;
	/** The last time from the appointment. */
	@Column(name = "endtime")
	private Date endtime;
	/** The next time from the apointment. */
	@Column(name = "nexttime")
	private Date nexttime;
	/** An enum that gives us the rhythm from the appointment. */
	@Column(name = "rhythm")
	@Type(type = "rhythmConverter")
	private Rhythm rhythm;
	/** The start time from the appointment. */
	@Column(name = "starttime")
	private Date starttime;
	
}

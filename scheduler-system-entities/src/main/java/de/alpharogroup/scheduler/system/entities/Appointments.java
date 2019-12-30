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
package de.alpharogroup.scheduler.system.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import de.alpharogroup.db.entity.BaseEntity;
import de.alpharogroup.scheduler.system.enums.Priority;
import de.alpharogroup.scheduler.system.enums.Rhythm;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * The Entity class {@link Appointments} is keeping the information for the appointments from a
 * given event. This can combined for instance with a user address to get an event location with an
 * appointment.
 */
@Entity
@Table(name = "appointments")
@TypeDefs({
	@TypeDef(name = "rhythmConverter", typeClass = de.alpharogroup.db.postgres.usertype.PGEnumUserType.class, parameters = {
			@Parameter(name = "enumClassName", value = "de.alpharogroup.scheduler.system.enums.Rhythm") }),
	@TypeDef(name = "priorityConverter", typeClass = de.alpharogroup.db.postgres.usertype.PGEnumUserType.class, parameters = {
					@Parameter(name = "enumClassName", value = "de.alpharogroup.scheduler.system.enums.Priority") })  })
@Getter
@Setter
@NoArgsConstructor
public class Appointments extends BaseEntity<Integer> implements Cloneable
{
	/** The serial Version UID */
	private static final long serialVersionUID = 1L;
	/** The last time from this appointment */
	@Column(name = "endtime")
	private Date endtime;
	/** The next time from this apointment */
	@Column(name = "nexttime")
	private Date nexttime;
	/** An enum that gives us the rhythm from this appointment */
	@Column(name = "rhythm")
	@Type(type = "rhythmConverter")
	private Rhythm rhythm;
	/** An enum that gives us the priority from this appointment */
	@Column(name = "priority")
	@Type(type = "priorityConverter")
	private Priority priority;
	/** The start time from this appointment */
	@Column(name = "starttime")
	private Date starttime;

}

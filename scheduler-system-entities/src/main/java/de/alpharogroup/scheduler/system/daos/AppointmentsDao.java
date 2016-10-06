package de.alpharogroup.scheduler.system.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import de.alpharogroup.db.dao.jpa.JpaEntityManagerDao;
import de.alpharogroup.scheduler.system.entities.Appointments;
import lombok.Getter;
import lombok.Setter;


@Repository("appointmentsDao")
public class AppointmentsDao extends JpaEntityManagerDao<Appointments, Integer>{
	/**
	 * The serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/** The entity manager. */
	@PersistenceContext
	@Getter
	@Setter
	private EntityManager entityManager;
}

package de.alpharogroup.scheduler.system.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import de.alpharogroup.db.dao.jpa.JpaEntityManagerDao;
import de.alpharogroup.scheduler.system.entities.Appointments;


@Repository("appointmentsDao")
public class AppointmentsDao extends JpaEntityManagerDao<Appointments, Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5693868415897202295L;

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;		
	}
}

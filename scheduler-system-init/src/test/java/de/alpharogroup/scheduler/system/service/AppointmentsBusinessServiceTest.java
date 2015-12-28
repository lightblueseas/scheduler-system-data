package de.alpharogroup.scheduler.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import de.alpharogroup.scheduler.system.entities.Appointments;
import de.alpharogroup.scheduler.system.service.api.AppointmentsService;

@ContextConfiguration(locations = "classpath:test-applicationContext.xml")
public class AppointmentsBusinessServiceTest extends AbstractTestNGSpringContextTests {

	@Autowired
	private AppointmentsService appointmentsService;

	@Test(enabled=false)
	public void test() {
		final List<Appointments> appointments = appointmentsService.findAll();
		System.out.println(appointments);
	}

}

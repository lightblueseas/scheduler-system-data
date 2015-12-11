package de.alpharogroup.scheduler.system.rest.client;

import de.alpharogroup.cxf.rest.client.AbstractRestClient;
import de.alpharogroup.scheduler.system.rest.api.AppointmentsResource;
import lombok.Getter;

public class SchedulerSystemRestClient extends AbstractRestClient
{

	/**
	 * The {@link AppointmentsResource}.
	 */
	@Getter
	private final AppointmentsResource appointmentsResource;

	/**
	 * Instantiates a new {@link SchedulerSystemRestClient} with the default base url.
	 */
	public SchedulerSystemRestClient()
	{
		this(DEFAULT_BASE_URL);
	}

	/**
	 * Instantiates a new {@link SchedulerSystemRestClient} with the given base url.
	 *
	 * @param baseUrl the base url
	 */
	public SchedulerSystemRestClient(final String baseUrl)
	{
		super(baseUrl);
		appointmentsResource = newResource(AppointmentsResource.class);
	}

}

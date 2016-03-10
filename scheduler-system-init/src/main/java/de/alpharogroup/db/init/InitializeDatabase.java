package de.alpharogroup.db.init;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

import de.alpharogroup.resourcebundle.properties.PropertiesExtensions;
import de.alpharogroup.scheduler.system.db.init.DatabaseInitialization;

/**
 * The Class {@link InitializeDatabase} initialize the specific database.
 */
public class InitializeDatabase
{

	/** The Constant logger. */
	protected static final Logger LOG = Logger.getLogger(InitializeDatabase.class.getName());

	/**
	 * The main method to start the initialization process from the specific database.
	 *
	 * @param args
	 *            the arguments of this main method
	 * @throws SQLException
	 *             is thrown if a database access error occurs or this method is called on a closed
	 *             connection
	 * @throws ClassNotFoundException
	 *             is thrown if the Class was not found or could not be located.
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static void main(final String[] args) throws IOException, ClassNotFoundException, SQLException
	{
		final Properties dbProperties = PropertiesExtensions.loadProperties("jdbc.properties");
		if(args != null && 0< args.length ) {
			dbProperties.setProperty(AbstractDatabaseInitialization.JDBC_CREATE_DB_PROCESS_KEY, args[0]);
		}
		new DatabaseInitialization(dbProperties).initializeDatabase();
	}

}

package de.alpharogroup.db.init;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

import de.alpharogroup.resourcebundle.properties.PropertiesExtensions;
import de.alpharogroup.scheduler.system.db.init.DatabaseInitialization;


public class InitializeDatabase {	
	/** The Constant logger. */
	protected static final Logger logger = Logger.getLogger(InitializeDatabase.class
			.getName());

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		Properties dbProperties = PropertiesExtensions.loadProperties("jdbc.properties");
		new DatabaseInitialization(dbProperties).initializeDatabase();
	}

}

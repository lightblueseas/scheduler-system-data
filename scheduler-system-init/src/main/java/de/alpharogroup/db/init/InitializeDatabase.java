package de.alpharogroup.db.init;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import de.alpharogroup.lang.PropertiesUtils;
import de.alpharogroup.scheduler.system.db.init.DatabaseInitialization;

import org.apache.log4j.Logger;


public class InitializeDatabase {	
	/** The Constant logger. */
	protected static final Logger logger = Logger.getLogger(InitializeDatabase.class
			.getName());

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		Properties dbProperties = PropertiesUtils.loadProperties("jdbc.properties");
		new DatabaseInitialization(dbProperties).initializeDatabase();
	}

}

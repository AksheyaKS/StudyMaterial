package com.capgemini.lesson15;

import java.util.Properties;
import java.util.Enumeration;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;

/**
 * -----------------------------------------------------------------------------
 * Used to provide an example of how to get/set Properties and load/save
 * property files.
 * -----------------------------------------------------------------------------
 */
public class DatasourcePropertyFiles {

	private static Properties createDefaultProperties() {

		Properties tempProp = new Properties();
		/* Database connection parameter properties are set */
		tempProp.setProperty("url",
				"jdbc:oracle:thin:@192.168.12.16:1521:oracle8i");
		tempProp.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		tempProp.setProperty("username", "trg1");
		tempProp.setProperty("password", "tiger");
		return tempProp;
	}

	private static void printProperties(Properties p, String s) {
		System.out.println();
		System.out.println("========================================");
		System.out.println(s);
		System.out.println("========================================");
		System.out.println("+---------------------------------------+");
		System.out.println("| Print Application Properties          |");
		System.out.println("+---------------------------------------+");
		p.list(System.out);
		System.out.println();
	}

	private static void saveProperties(Properties p, String fileName) {
		OutputStream propsFile;

		try {
			propsFile = new FileOutputStream(fileName);
			p.store(propsFile, "Properties File to the Test Application");
			propsFile.close();
		} catch (IOException ioe) {
			System.out.println("I/O Exception.");
			ioe.printStackTrace();
			System.exit(0);
		}

	}

	private static Properties loadProperties(String fileName) {

		InputStream propsFile;
		Properties tempProp = new Properties();

		try {
			propsFile = new FileInputStream(fileName);
			tempProp.load(propsFile);
			propsFile.close();
		} catch (IOException ioe) {
			System.out.println("I/O Exception.");
			ioe.printStackTrace();
			System.exit(0);
		}
		return tempProp;
	}

	private static Properties alterProperties(Properties p) {

		Properties newProps = new Properties();
		Enumeration enProps = p.propertyNames();
		String key = "";

		while (enProps.hasMoreElements()) {

			key = (String) enProps.nextElement();

			/* If we want to alter the username property 
			can be set to new username and also for all 
			 the other properties*/

			if (key.equals("username")) {
				newProps.setProperty(key, "scott");

			} else {
				newProps.setProperty(key, p.getProperty(key));
			}

		}
		return newProps;
	}

	/**
	 * Sole entry point to the class and application.
	 * @param args Array of String arguments.
	 */

	public static void main(String[] args) {

		final String PROPFILE = "MyApplication.properties";
		Properties myProp;
		Properties myNewProp;

		myProp = createDefaultProperties();
		printProperties(myProp, "Newly Created (Default) Properties");
		saveProperties(myProp, PROPFILE);
		myNewProp = loadProperties(PROPFILE);
		printProperties(myNewProp, "Loaded Properties");
		myNewProp = alterProperties(myProp);
		printProperties(myNewProp, "After Altering Properties");
		saveProperties(myNewProp, PROPFILE);
		Properties myNewProp1 = loadProperties(PROPFILE);
		Enumeration enProps = myNewProp1.propertyNames();
		String key = "";//local key variable
		String param[]; //String array to read properties.
		param = new String[4];
		int i = 0;
		while (enProps.hasMoreElements()) {
			key = (String) enProps.nextElement();
			System.out.println(key);
			param[i] = (String) myNewProp1.getProperty(key);
			System.out.println("  " + key + "  ->  "
					+ myNewProp1.getProperty(key));
			i++;
		}

	}
}

/*

 OUTPUT:

 Newly Created (Default) Properties
 ========================================
 +---------------------------------------+
 | Print Application Properties          |
 +---------------------------------------+
 -- listing properties --
 url=jdbc:oracle:thin:@192.168.12.16:1521:...
 password=tiger
 driver=oracle.jdbc.driver.OracleDriver
 username=trg1
 ========================================
 Loaded Properties
 ========================================
 +---------------------------------------+
 | Print Application Properties          |
 +---------------------------------------+
 -- listing properties --
 password=tiger
 url=jdbc:oracle:thin:@192.168.12.16:1521:...
 driver=oracle.jdbc.driver.OracleDriver
 username=trg1

 ========================================
 After Altering Properties
 ========================================
 +---------------------------------------+
 | Print Application Properties          |
 +---------------------------------------+
 -- listing properties --
 url=jdbc:oracle:thin:@192.168.12.16:1521:...
 password=tiger
 driver=oracle.jdbc.driver.OracleDriver
 username=scott


 password  ->  tiger
 url  ->  jdbc:oracle:thin:@192.168.12.16:1521:oracle8i
 driver  ->  oracle.jdbc.driver.OracleDriver
 username  ->  scott
 */
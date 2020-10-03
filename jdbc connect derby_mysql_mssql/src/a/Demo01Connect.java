package a;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.swing.JOptionPane;

public class Demo01Connect {

	static String url;
	static String driverName;

	public static void main(String[] args) {
//		load user chosen database properties (the url and the driver name)
		loadAppProprties();

//		loading the user chosen driver (this is not required)
		loadDriver();

//		print all drivers available in DriverManager
		printDrivers();

//		connect / disconnect
		try (Connection con = DriverManager.getConnection(url)) {
			System.out.println("connected: ");
			System.out.println(url);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("disconnected: ");
		System.out.println(url);
	}

	// ============================================================
	// private internal methods
	private static void loadAppProprties() {
		String[] options = { "derby", "mysql", "sql server" };
		int opt = JOptionPane.showOptionDialog(null, "Choose Database", "Database", JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, "derby");

		switch (opt) {
		case 0:
			driverName = AppEnv.properties.getProperty("db.driver.name.derby");
			url = AppEnv.properties.getProperty("db.url.derby");
			break;
		case 1:
			driverName = AppEnv.properties.getProperty("db.driver.name.mysql");
			url = AppEnv.properties.getProperty("db.url.mysql");
			break;
		case 2:
			driverName = AppEnv.properties.getProperty("db.driver.name.sqlserver");
			url = AppEnv.properties.getProperty("db.url.sqlserver");
			break;
		}
	}

	private static void loadDriver() {
		System.out.println("=== loading driver ===");
		try {
			Class.forName(driverName);
			System.out.println(driverName);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}

	private static void printDrivers() {
		System.out.println("\n=== drivers available in DriverManager:");
		Enumeration<Driver> enumeration = DriverManager.getDrivers();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement().getClass());
		}
		System.out.println("=================\n");
	}
}

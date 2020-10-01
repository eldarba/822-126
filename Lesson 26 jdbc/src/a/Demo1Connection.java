package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo1Connection {

	public static void main(String[] args) {

		// define the database url (uniform resource locator)
		String url = "jdbc:derby://localhost:1527/822_126_db1";
		url += ";create=true";

		// try with resources - java will close the connection for us
		try (Connection con = DriverManager.getConnection(url);) {
			System.out.println("connected to " + url);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("disconnected from " + url);

	}

}

package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2Statements {

	public static void main(String[] args) {

		String url = "jdbc:derby://localhost:1527/822_126_db1";

		try (Connection con = DriverManager.getConnection(url);) {

			// work with the database
			// get a Statement Object using the connection
			Statement stmt = con.createStatement();

			// define an sql command for creating a table
			String sql = "create table person(id int primary key, name varchar(10), age int)";
//			String sql = "drop table person";
			System.out.println(sql);
			// execute the sql command using the statement object
			stmt.executeUpdate(sql);
			System.out.println("done");

			// stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

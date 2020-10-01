package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo5update {

	public static void main(String[] args) {

		String url = "jdbc:derby://localhost:1527/822_126_db1";

		try (Connection con = DriverManager.getConnection(url);) {

			Statement stmt = con.createStatement();

			String sql = "update person set age=20 where id > 5";
			System.out.println(sql);

			// get the select result to a ResultSet object
			stmt.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

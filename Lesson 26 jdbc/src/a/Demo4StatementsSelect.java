package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo4StatementsSelect {

	public static void main(String[] args) {

		String url = "jdbc:derby://localhost:1527/822_126_db1";

		try (Connection con = DriverManager.getConnection(url);) {

			Statement stmt = con.createStatement();

			String sql = "select * from person";
			System.out.println(sql);

			// get the select result to a ResultSet object
			ResultSet rs = stmt.executeQuery(sql);

			// iterate over the result set
			while (rs.next()) {
				System.out.println("id: " + rs.getInt(1) + ", name: " + rs.getString(2) + ", age: " + rs.getInt(3));
				// System.out.println("id: " + rs.getInt("id") + ", name: " +
				// rs.getString("name") + ", age: " + rs.getInt("age"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

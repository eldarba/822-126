package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3StatementsInsert {

	public static void main(String[] args) {

		String url = "jdbc:derby://localhost:1527/822_126_db1";

		try (Connection con = DriverManager.getConnection(url);) {

			Statement stmt = con.createStatement();

			String sql = "insert into person values(7, 'Dina', 33)";
			System.out.println(sql);
			stmt.executeUpdate(sql);
			System.out.println("done");

			// stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

package b.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonDaoImpl implements PersonDAO {

	private String url = "jdbc:derby://localhost:1527/822_126_db1";

	@Override
	public void saveStatement(Person person) {
		try (Connection con = DriverManager.getConnection(url);) {
			String sql = "insert into person values(";
			sql += person.getId() + ", '" + person.getName() + "', " + person.getAge() + ")";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void savePreparedStatement(Person person) {
		try (Connection con = DriverManager.getConnection(url);) {
			// the sql from PreparedStatements can contain ? marks instead of real values
			String sql = "insert into person values(?, ?, ?)";
			// a PreparedStatement object has an sql usually with parameters (?,?,?)
			PreparedStatement pstmt = con.prepareStatement(sql);
			// initialize the PreparedStatement parameters
			pstmt.setInt(1, person.getId());
			pstmt.setString(2, person.getName());
			pstmt.setInt(3, person.getAge());
			// execute the initialized PreparedStatement (without the sql parameter)
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Person find(int id) {
		try (Connection con = DriverManager.getConnection(url);) {
			String sql = "select * from person where id=" + id;
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				// if the person required is in the database
				// we create an object and initialize from rs
				Person person = new Person();
				person.setId(id);
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
				return person;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public void update(Person person) {
		try (Connection con = DriverManager.getConnection(url);) {
			String sql = "update person set name=?, age=? where id=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			// initialize the PreparedStatement parameters
			pstmt.setString(1, person.getName());
			pstmt.setInt(2, person.getAge());
			pstmt.setInt(3, person.getId());
			// execute
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(int id) {
		try (Connection con = DriverManager.getConnection(url);) {
			String sql = "delete from person where id = " + id;
			PreparedStatement pstmt = con.prepareStatement(sql);
			// initialize the PreparedStatement parameters
			pstmt.setInt(1, id);
			// execute
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

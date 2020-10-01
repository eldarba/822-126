package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConnectionPool {

	private Set<Connection> connections = new HashSet<Connection>();
	public static final int MAX = 5;
	private String url;

	private static ConnectionPool instance;

	private ConnectionPool() throws SQLException {
		for (int i = 0; i < MAX; i++) {
			connections.add(DriverManager.getConnection(url));
		}
	}

	public static ConnectionPool getInstance() throws SQLException {
		if (instance == null) {
			instance = new ConnectionPool();
		}
		return instance;
	}

	public synchronized Connection getConnection() {
		while (connections.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Iterator<Connection> it = connections.iterator();
		Connection con = it.next();
		it.remove();
		return con;
	}

}

package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

	public static volatile DBManager dbManager; // = new DBManager();
	public static volatile Connection connection;

	private DBManager() {
		
		if (dbManager != null) {
			throw new RuntimeException("Please use getDbManager method!");
		}
	}

	public static DBManager getDbManager() {
		
		if(dbManager == null) {
			synchronized (DBManager.class) {
				
				if(dbManager == null) {
					dbManager = new DBManager();
				}
			}
		}
		
		return dbManager;
	}
	
	public Connection getConnection() {
		
		if(connection == null) {
			synchronized (DBManager.class) {
				
				if(connection == null) {
					String url = "jdbc:mysql://localhost:3306/test";
					
					try {
						connection = DriverManager.getConnection(url);
						System.out.println("Database Connected!");
						
					} catch(SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		return connection;
	}
}

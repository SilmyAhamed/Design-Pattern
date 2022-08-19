package main;

import java.sql.Connection;

public class Application {

	public static void main(String[] args) {
		long start;
		long end;

		DBManager dbManager = DBManager.getDbManager();
		System.out.println(dbManager);

		start = System.currentTimeMillis();
		Connection connection = dbManager.getConnection(); // This line will created connection
		end = System.currentTimeMillis();
		System.out.println(end - start);

		DBManager dbManager01 = DBManager.getDbManager();
		System.out.println(dbManager01);
		
		start = System.currentTimeMillis();
		Connection connection01 = dbManager.getConnection(); // This line will not created connection
		end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}

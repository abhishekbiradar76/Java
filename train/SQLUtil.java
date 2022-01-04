package com.train;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLUtil {
public static Connection creatConnection() {
	Connection connection=null;
	try {
		connection=DriverManager.getConnection(Traa.URL, Traa.USERNAME, Traa.PASSWORD);
		return connection;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return null;
	
}
public static void closeConnection(Connection sqlCon) {
	
	if(sqlCon!=null) { 
		try {
			sqlCon.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
}

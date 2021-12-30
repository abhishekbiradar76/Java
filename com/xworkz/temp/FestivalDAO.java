package com.xworkz.temp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FestivalDAO {
	public boolean save(FestivalDTO dto) {
		Connection connection=null;
		try { 
			Class.forName(fess.DRIVERCLASS);
			connection=DriverManager.getConnection(fess.URL, fess.USENAME, fess.PASSWORD);
			String str= "insert into fest value("+dto.getId()+",'"+dto.getName()+"','"+dto.getDate()+"','"+dto.getPlace()+"')";
			Statement stmt= connection.createStatement();
			 int row=stmt.executeUpdate(str);
			 if(row==1) {
				 return true;
			 }
			 
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean delete(int id) {
		Connection connection=null;
		try {
			Class.forName(fess.DRIVERCLASS);
			connection=DriverManager.getConnection(fess.URL, fess.USENAME, fess.PASSWORD);
			String str="delete from fest where id="+id;
			Statement stmt = connection.createStatement();
			int row=stmt.executeUpdate(str);
			if(row==1) {
				return true;
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		return false;
		
	}
}
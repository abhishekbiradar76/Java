package com.xworkz.icecreamm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class IcecreamDAO {
	public boolean save(IcecreamDTO dto) {
		Connection connection =null;
		try {
			Class.forName(icee.DRIVECLASS);
		
			connection =DriverManager.getConnection(icee.URL, icee.USERNAME, icee.PASSWORD);
			String str="insert into ice value("+dto.getId()+",'"+dto.getName()+"','"+dto.getFlavour()+"',"+dto.getRate()+")";
			Statement stm=connection.createStatement();
			int row= stm.executeUpdate(str);
			if(row==1) {
				return true;
			}
	}
			catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
	public boolean delete(int id) {
		Connection connection=null;
		try {
			Class.forName(icee.DRIVECLASS);
			connection = DriverManager.getConnection(icee.URL, icee.USERNAME, icee.PASSWORD);
			String str="delete from ice where id="+id;
			Statement stm=connection.createStatement();
			int row=stm.executeUpdate(str);
			if(row==1) {
				return true;
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}

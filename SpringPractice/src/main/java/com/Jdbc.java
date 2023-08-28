package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc {
	Connection con;
	ResultSet res;
	
	 public Jdbc()  {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:postgresql://192.168.110.48:5432/plf_training", "plf_training_admin", "pff123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public boolean meth1(ModelUser u)  {
		try {
			try {
				PreparedStatement ps;
				ps = con.prepareStatement("select password from Likhita_validations where username=?");
				ps.setString(1,u.getInputName());
				System.out.println(u.getInputName());
				res=ps.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(res.next()) {
			return true;
		}
		}
		catch(Exception e) {
	
		}
		return false;
		
		
	}
	

}

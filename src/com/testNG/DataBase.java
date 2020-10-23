package com.testNG;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DataBase {

	@Test
	public void testDB() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysqp.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection con=DriverManager.getConnection("jdbc.mysql://localhost:port/dbname","username","password");
		System.out.println("Connected to MySQL DB");
		
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery("select*from Employee");
		
		while(rs.next()) {
			String firstName=rs.getString("firstName");
			System.out.println("Database record is :"+firstName);
		} 
	}
}

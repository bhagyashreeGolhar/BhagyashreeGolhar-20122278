package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class ReadRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root","root");
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from jdbcemp");
			while(rs.next())
			{
				System.out.println("ID:- "+rs.getInt(1)+"Name :- "+rs.getString(2)+"Age :-"+rs.getInt(3)+"Salary :-"+rs.getInt(4)+"Designation :-"+rs.getString(5));
			}
			
			System.out.println("Data Read successfully");
			conn.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Some Exception Occured : "+e);
		}

	}

}

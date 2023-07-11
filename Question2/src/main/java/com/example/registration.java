package com.example;

//package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/registration")
public class registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public registration() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String number=request.getParameter("number");
		int marks=Integer.parseInt(request.getParameter("marks"));
		String branch=request.getParameter("branch");		
		
		
		
		try
		{
			Class.forName("com.sql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root","root");
			Statement stmt=conn.createStatement();
			PreparedStatement pstmt=conn.prepareStatement("insert into studentServlet values(?,?,?,?,?)");
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, number);
			pstmt.setInt(4, marks);
			pstmt.setString(5, branch);
			
			pstmt.execute();
			conn.close();
			
			RequestDispatcher rd=request.getRequestDispatcher("Success.html");
			rd.forward(request, response);
			
			System.out.println("Data Inserted Successfully");
		}
		catch(Exception e)
		{
			System.out.println("Some Exception Ocuured :"+e);
		}
		
		
		
	}

}

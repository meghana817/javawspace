package com.mphasisjdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCMain {
	public static void main(String[]args) {
		
	
	System.out.println("WElcome to JDBC!....");
	//load the driver
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println(e.getMessage());	
	}
	//create connection
	
	try {
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String password="root@39";
		Connection con = DriverManager.getConnection(url,user,password);
	String query="select*from products";
		PreparedStatement stmt = con.prepareStatement(query);
	ResultSet rs = stmt.executeQuery();
	while(rs.next())
	{
		System.out.println(rs.getString("name")+":"+rs.getInt("price"));
	}
	rs.close();
	stmt.close();
	con.close();
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
	}
}

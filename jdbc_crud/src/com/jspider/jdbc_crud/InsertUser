package com.jspider.jdbc_crud_controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUser {
	public static void main(String[] args){
		try {		
			//step 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step 2: create db connection
			String url="jdbc:mysql://localhost:3308/jdbc_practice";
			String userName="root";
			String password="Sani@123";
			Connection connection=DriverManager.getConnection(url, userName, password);
			System.out.println("Connection created successfully");
			//step 3: create statement
			Statement statement=connection.createStatement();
			//execute query
			String query="Insert into students(rollno,name,age,phoneno,address,fathername) values(1,'Nidhi',29,999999999,'noida','Amar')";
			int rows=statement.executeUpdate(query);
			System.out.println("Row added");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("getting error");
			e.printStackTrace();
		}
	}
	
}

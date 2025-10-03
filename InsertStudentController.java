package com.jspider.jdbc_crud_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStudentController {
	
	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		
		try {
			//step-1 load or register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step-2 create connection
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String user = "root";
			String pass = "root";
			
			connection=DriverManager.getConnection(url, user, pass);
			
			System.out.println(connection);
			
			//step-3 create statement
			statement=connection.createStatement();
			
			//step-4 execute Query
			String insertStudentQuery = "insert into student(id,name,email,phone,dob) values(7868776,'aman','aman@gmail.com',897989,'1999-09-10')";
			
			int a=statement.executeUpdate(insertStudentQuery);
			
			String msg = a!=0?"registered":"something went wrong";
			
			System.out.println(msg);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(statement!=null&&connection!=null) {
					statement.close();
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}

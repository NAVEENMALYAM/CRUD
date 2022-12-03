package com.tweet.naveen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteData {
	
	static final String dburl="jdbc:mysql://localhost:3306/helloworld";
	static final String user="root";
	static final String pass="pass@word1";
	static final String query="delete from student where student_city=?";

		public static void main(String[] args) {
	
	try(Connection con=DriverManager.getConnection(dburl,user,pass);
			PreparedStatement ps=con.prepareStatement(query);
			){
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter studen city");
		String cityname=sc.next();
		
		ps.setString(1,cityname);
		ps.executeUpdate();
		System.out.println("deleted successfully");
		}
		catch(SQLException e) {
		e.printStackTrace();
	}

}
		}
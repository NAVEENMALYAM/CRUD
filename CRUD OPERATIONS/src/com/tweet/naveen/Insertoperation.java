package com.tweet.naveen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insertoperation {
	
	static final String dburl="jdbc:mysql://localhost:3306/helloworld";
	static final String user="root";
	static final String pass="pass@word1";
	static final String query="insert into student(student_id,student_fname,student_lname,student_email,student_city,student_phone) values(?,?,?,?,?,?)";

	public static void main(String[] args) {
		
		try(Connection con=DriverManager.getConnection(dburl, user, pass);
			PreparedStatement ps=con.prepareStatement(query);
			){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter student id");
			int sid=sc.nextInt();
			System.out.println("enter student firstname");
			String fname=sc.next();
			System.out.println("enter student lasttname");
			String lname=sc.next();
			System.out.println("enter student email");
			String email=sc.next();
			System.out.println("enter student city");
			String city=sc.next();
			System.out.println("enter student phonenumber");
		    String phone=sc.next();
		    
		   ps.setInt(1, sid);
		   ps.setString(2, fname);
		   ps.setString(3,lname);
		   ps.setString(4, email);
		   ps.setString(5, city);
		   ps.setString(6, phone);
		   ps.executeUpdate();
		   System.out.println("updated successful1");
		   
		   
		   ps.setInt(1  , sid);
		   ps.setString(2, fname);
		   ps.setString(3,lname);
		   ps.setString(4, email);
		   ps.setString(5, city);
		   ps.setString(6, phone);
		   ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}

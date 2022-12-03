package com.tweet.naveen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateData {

	static final String dburl="jdbc:mysql://localhost:3306/helloworld";
	static final String user="root";
	static final String pass="pass@word1";
	static final String query="update student set student_city=? where student_email=?";

	
    public static void main(String[] args) {
    	try(Connection con=DriverManager.getConnection(dburl,user,pass);
				PreparedStatement ps=con.prepareStatement(query);
    			){
    		
    		Scanner sc =new Scanner(System.in);
    		System.out.println("enter studen city");
    		String cityname=sc.next();
    		System.out.println("enter student email");
    		String mail=sc.next();
    		
    		ps.setString(1,cityname  );
    		ps.setString(2, mail);
    		ps.executeUpdate();
    		System.out.println("upated successfully");

    	
    	} catch (SQLException e){
    		e.printStackTrace();
			
		}
	}
    } 
  

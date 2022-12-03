package com.tweet.naveen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class RetriveData {
	
	static final String dburl="jdbc:mysql://localhost:3306/helloworld";
	static final String user="root";
	static final String pass="pass@word1";
	static final String query="select * from student";

	public static void main(String[] args) {
		try(Connection con=DriverManager.getConnection(dburl,user,pass);
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(query);){
			while(rs.next()) {
				System.out.println("sudent id:" +	rs.getInt("student_id")); 
				System.out.println("sudent firstname:" +	rs.getString("student_fname")); 
				System.out.println("sudent last name:" +	rs.getString("student_lname")); 
				System.out.println("sudent mail:" +	rs.getString("student_email")); 
				System.out.println("sudent city:" +	rs.getString("student_city")); 
				System.out.println("sudent phone:" +	rs.getString("student_phone")); 
		
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}

package com.UserInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.Scanner;

public class UserClass {

	Connection con = null;
	PreparedStatement stmt = null;
	Scanner scan=new Scanner(System.in);
	public UserClass() throws SQLException
	{
		DBProperties database = new DBProperties();

		con = DriverManager.getConnection(database.getUrl(), database.getUserName(), database.getPassword());
		
	}
	//stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	public void addUser() throws SQLException
	{
		stmt=con.prepareStatement("insert into user(FIRST_NAME,LAST_NAME,USERNAME,PASSWORD,EMAIL,PHONE_NUMBER,CITY) values(?,?,?,?,?,?,?)");
		User user=new User();
		System.out.println("Enter the First Name");
		user.setF_name(scan.next());
		System.out.println("Enter the Last Name");
		user.setL_name(scan.next());
		System.out.println("Enter the Username");
		user.setUserName(scan.next());
		System.out.println("Enter the Password");
		user.setPassword(scan.next());
		System.out.println("Enter the Email");
		user.setEmail(scan.next());
		System.out.println("Enter the Phone Number");
		user.setPhnumber(scan.nextDouble());
		System.out.println("Enter the City");
		user.setCity(scan.next());
		stmt.setString(1,user.getF_name());
		stmt.setString(2, user.getL_name());
		stmt.setString(3,user.getUserName());
		stmt.setString(4,user.getPassword());
		stmt.setString(5,user.getEmail());
		stmt.setDouble(6,user.getPhnumber());
		stmt.setString(7,user.getCity());
		
		int res = stmt.executeUpdate();
		if(res==1)
			System.out.println("Registered Successfully");
		else
			System.out.println("Registration Failed");
			
		
	}
	
	

}

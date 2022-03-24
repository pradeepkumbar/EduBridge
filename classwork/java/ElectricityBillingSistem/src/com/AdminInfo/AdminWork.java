package com.AdminInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.UserInfo.DBProperties;

public class AdminWork implements AdminFunctions {

	Connection con = null;
	Statement stmt=null;
	PreparedStatement stmt1=null;
	public AdminWork() throws SQLException
	{
		DBProperties database = new DBProperties();

		con = DriverManager.getConnection(database.getUrl(), database.getUserName(), database.getPassword());

	}
	
	public void userDetails()
	{
		String str="select RR_NUMBER,FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER,CITY from user";
		try {
			stmt=con.createStatement();
			ResultSet res=stmt.executeQuery(str);
			while(res.next())
			{
				System.out.println("RR_NUMBER :"+res.getInt("RR_NUMBER"));
				System.out.println("First_Name :"+res.getString("FIRST_NAME"));
				System.out.println("LAST_NAME :"+res.getString("LAST_NAME"));
				System.out.println("EMAIL :"+res.getString("EMAIL"));
				System.out.println("PHONE NUMBER :"+res.getString("PHONE_NUMBER"));
				System.out.println("CITY :"+res.getString("CITY"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void userDelete(int id) throws SQLException
	{
		

		stmt1 = con.prepareStatement("delete from user where RR_NUMBER=?");
		stmt1.setInt(1, id);
		int rs = stmt1.executeUpdate();
		if (rs == 1) {
			System.out.println("deleted succesfully");
		} else {
			System.out.println("not deleted");
		}
	}
	public void assignBill(int num,float bill) throws SQLException {
		stmt1 = con.prepareStatement("update user set BILL=? where RR_NUMBER=?");
		stmt1.setFloat(1, bill);
		stmt1.setInt(2, num);
		int rs = stmt1.executeUpdate();
		if (rs == 1) {
			System.out.println("Üpdated succesfully");
		} else {
			System.out.println("There is some problem to updated");
		}

	}
}

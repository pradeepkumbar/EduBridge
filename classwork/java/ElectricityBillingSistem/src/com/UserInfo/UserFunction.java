package com.UserInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class UserFunction {


	Connection con = null;
	Statement stmt = null;

	public UserFunction() throws SQLException {

		DBProperties db = new DBProperties();

		con = DriverManager.getConnection(db.getUrl(), db.getUserName(), db.getPassword());

	}
	Scanner scan=new Scanner(System.in);
	public void getrr() throws SQLException
	{
		stmt=con.createStatement();
		System.out.println("Enter your username");
		String uname=scan.next();
		System.out.println("Enter your passwowrd");
		String pass=scan.next();
		String str="select RR_NUMBER from user where USERNAME='"+uname+"'and password='"+pass+"'";
		ResultSet res=stmt.executeQuery(str);
		while(res.next())
		{
			System.out.println("RR NUMBER IS-->"+res.getInt("RR_NUMBER"));
		}
	}
	public void checkbill() throws SQLException
	{
		stmt=con.createStatement();
		System.out.println("Enter your RR NUMBER ");
		int rrnum=scan.nextInt();
		String str="select Bill from user where RR_NUMBER='"+rrnum+"'";
		ResultSet res=stmt.executeQuery(str);
		while(res.next())
		{
			System.out.println("Bill is-->"+res.getInt("Bill")+"Rs");
		}
	}
	public void paybill() throws SQLException
	{
		stmt=con.createStatement();
		System.out.println("Enter your RR NUMBER ");
		int rrnum=scan.nextInt();
		System.out.println("Enter the amount");
		int amount=scan.nextInt();
		String str="update user set Bill='"+amount+"' where RR_NUMBER='"+rrnum+"'";
		int rs = stmt.executeUpdate(str);
		if (rs == 1) {
			System.out.println("Bill Payed succesfully");
		} else {
			System.out.println("Bill not Payed");
		}
	}
}

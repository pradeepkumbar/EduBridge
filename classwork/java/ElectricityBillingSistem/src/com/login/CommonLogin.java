package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.AdminInfo.Admin;
import com.UserInfo.DBProperties;
import com.UserInfo.UserFunction;

public class CommonLogin {
	Connection conn=null;
	Statement stmt=null;
	public CommonLogin() throws SQLException
	{
		DBProperties database = new DBProperties();

		conn = DriverManager.getConnection(database.getUrl(), database.getUserName(), database.getPassword());
		
	}
	Scanner scan=new Scanner(System.in);

	public void loginUser(String username,String password,int n) throws SQLException
	{
		stmt=conn.createStatement();
		String str="Select * from user where username='"+username+"'and password='"+password+"'";
		ResultSet res=stmt.executeQuery(str);
		if(res.next()) {
			System.out.println("............Login Successfully...........");
			
			char ch=0;
			do {
				System.out.println("1.Know RR NUBER");
				System.out.println("2.Check Bill");
				System.out.println("3.Pay Bill");
				int choice=scan.nextInt();
				switch(choice)
				{
				case 1:UserFunction usefunc=new UserFunction();
				usefunc.getrr();
				break;
				case 2:UserFunction usefunc1=new UserFunction();
					usefunc1.checkbill();
					break;
				case 3:UserFunction usefunc2=new UserFunction();
				usefunc2.paybill();
				break;
				default: System.out.println("Entered the wrong choice");
				}
				System.out.println("Do you want to continue(Y/y)");
				ch=scan.next().charAt(0);
			}while(ch=='Y' || ch=='y');
			scan.close();
				
			
			System.out.println("");
		}
			
			
		else
			System.out.println("........Entered the Wrong Credentials........");
		
	}
	public void loginAdmin(String username,String password,int m) throws SQLException
	{
		stmt=conn.createStatement();
		String str="Select * from admin where username='"+username+"'and password='"+password+"'";
		ResultSet resl=stmt.executeQuery(str);
		if(resl.next())
			System.out.println("............Login Successfully...........");
		else
			System.out.println("........Entered the Wrong Credentials........");
		Admin admin=new Admin();
				admin.userinfo();
	}
}

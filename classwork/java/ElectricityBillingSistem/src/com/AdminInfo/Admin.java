package com.AdminInfo;

import java.sql.*;
import java.util.Scanner;
public class Admin {


	//@SuppressWarnings("null")
	AdminWork adminwork;
	public void userinfo() throws SQLException
	{
		char ch=0;
		Scanner scan=new Scanner(System.in);
		do {
			System.out.println("1.User details");
			System.out.println("2.User delete");
			System.out.println("3.Assign bill to the user");
			int choice=scan.nextInt();

			switch(choice)
			{
			case 1: adminwork=new AdminWork();
			adminwork.userDetails();
			break;

			case 2:System.out.println("Enter the RR_NUMBER to to Delet the user");
				int id=scan.nextInt();
				AdminWork adminwork1=new AdminWork();	
			adminwork1.userDelete(id);
			break;

			case 3:System.out.println("Enter the RR NUMBER");
			int num=scan.nextInt();
			System.out.println("Enter the bill amount to assign");
			int bill=scan.nextInt();
			AdminWork adminwork2=new AdminWork();
			adminwork2.assignBill(num,bill);
			break;
			default: System.out.println("Entered the wrong choice");
			}
			System.out.println("Do you want to continue(Y/y)");
			ch=scan.next().charAt(0);
		}while(ch=='Y' || ch=='y');
		scan.close();
	}



}


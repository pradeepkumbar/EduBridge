package com.MainFunction;
//import com.AdminInfo.*;
import com.UserInfo.*;
import java.sql.SQLException;
import java.util.Scanner;
import com.login.*;


public class Main {

	public static void main(String[] args) throws SQLException {
		
		
		
			System.out.println("**************Electricity billing System******************");
			System.out.println();
			System.out.println("********************** -->Login<-- ***************8*******");
			System.out.println("1.Login");
			System.out.println("2.User Registration");
			Scanner scan=new Scanner(System.in);
			int ch=scan.nextInt();
			switch(ch)
			{
			case 1:System.out.println("Enter the Username");
			String userName=scan.next();
			System.out.println("Enter the Password");
			String password=scan.next();
			System.out.println("-->Select 1 for user\n-->Select 2 for Admin");
			int n=scan.nextInt();
			CommonLogin userlog=new CommonLogin();
			//Admin admin=new Admin();
			if(n==1)
			{
				userlog.loginUser(userName,password,n);
			}
			else
			{
				userlog.loginAdmin(userName,password,n);
			}
			break;
			case 2:UserClass uclass=new UserClass();
			uclass.addUser();
			main(null);
			break;
						
			default:System.out.println("entered the wrong choice");
			}
			
			scan.close();

	}

}

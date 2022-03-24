package MainClass;
import electricity.Admin;
import electricity.User;

//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//import java.util.HashMap;
//import java.util.Map;
import java.util.Scanner;
//import userlogincredentials.*;
public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		char chr=0;
		do {
			System.out.println("**************Electricity billing System******************");
			System.out.println("************Login***********");
			System.out.println("1.Admin Login");
			System.out.println("2.User Registration");
			System.out.println("3.User Login");
			Scanner scan=new Scanner(System.in);
			int ch=scan.nextInt();
			switch(ch)
			{
			case 1:System.out.println("Enter the Username");
			String userName=scan.next();
			System.out.println("Enter the Password");
			String pasword=scan.next();
			if(userName.equals("user") && pasword.equals("1234"))
				System.out.println("wellcome");
			else
				System.out.println("Enter the valid user name and password");
			break;
			case 2:ObjectOutputStream userfile=null;
			try {
				userfile=new ObjectOutputStream(new FileOutputStream("UserRecord.obj"));
			} catch (FileNotFoundException e) {
				System.out.println("File not found");
			} catch (IOException e) {
				e.printStackTrace();
			}   
			System.out.println("Enter the First Name");
			String fname=scan.next();
			System.out.println("Enter the Last Name");
			String lname=scan.next();
			System.out.println("Enter the Username");
			String username=scan.next();
			System.out.println("Enter the Password");
			String password=scan.next();
			System.out.println("Enter the Email");
			String email=scan.next();
			System.out.println("Enter the Phone Number");
			double phnumber=scan.nextDouble();
			System.out.println("Enter the City");
			String city=scan.next();
			try {
				userfile.writeObject(new User(fname,lname,email,phnumber,city));
				userfile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			User userlogin=new User();
			userlogin.details(username,password);
			System.out.println("Registration Successfull");
			break;
			case 3:Admin.displayUser();
			System.out.println("Enter the UserName");
			String uname=scan.next();
			System.out.println("Enter the Password");
			String psword=scan.next();
			//User.login(uname,psword);
			break;
			default:
			}
			System.out.println("Do you want to continue?(y/Y or n/N ");
			chr=scan.next().charAt(0);
		}while(chr=='Y'||chr=='y');

	}

}

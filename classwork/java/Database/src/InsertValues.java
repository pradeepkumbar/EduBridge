//package pac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertValues{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//loading driver
		try {
		//Class.forName("com.mysql.jdbc.Driver");
		
		//establish connection to the database
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/edubridge?characterEncoding=utf8","root","root");
		
		//creating statement object to execute the database queries
		Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
		//executequery executes the database query and we are storing the result into the 
		
		//Resultset object
		Scanner scan=new Scanner(System.in);
		String pub_id=scan.nextLine();
		String pub_name=scan.nextLine();
		int phone=scan.nextInt();
		String address=scan.nextLine();
		String city=scan.nextLine();
		String ZIP=scan.nextLine();
		
		String str="insert into publishers(pub_id,pub_name,phone,address,city,ZIP)values('101','pradeep',987654,'k k kppa bgm','belagavi','1234')";
				
		int res=statement.executeUpdate(str);
		if(res==0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}

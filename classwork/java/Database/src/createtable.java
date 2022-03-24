//package pac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class createtable {

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
		String str="CREATE TABLE Publishers"+"(pub_id VARCHAR(5),"+"pub_name VARCHAR(50),"+"phone INTEGER,"+"address VARCHAR(50), "+"city VARCHAR(50), "+"ZIP VARCHAR(20))";

		
		statement.execute(str);

				 
		
		
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}

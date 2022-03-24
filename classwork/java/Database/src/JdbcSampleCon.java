//package pac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSampleCon {

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
		ResultSet resultSet=statement.executeQuery("select *from student");
		resultSet.absolute(3);
		System.out.println("Id--->"+resultSet.getInt("sid"));
		System.out.println("Name--->"+resultSet.getString("sname"));
		System.out.println("marks--->"+resultSet.getInt("marks"));
resultSet.beforeFirst();
		while(resultSet.next())//cursor will be pointing to the first record
		{
			System.out.println("Id--->"+resultSet.getInt("sid"));
			System.out.println("Name--->"+resultSet.getString("sname"));
			System.out.println("marks--->"+resultSet.getInt("marks"));
			
		}
		
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}

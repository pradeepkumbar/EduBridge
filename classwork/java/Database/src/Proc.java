//package pac;

import java.sql.*;  
public class Proc {  
public static void main(String[] args) throws Exception{  
  
/*Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","hr","hr"); */ 
  
//Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/edubridge?characterEncoding=utf8","root","root");
	
//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/edubridge?characterEncoding=utf8","root","root1");
CallableStatement stmt=con.prepareCall("{?= call func_cube(?)}");
stmt.registerOutParameter(1,Types.INTEGER); 
stmt.setInt(2,8);

stmt.execute();
System.out.println(stmt.getInt(1)); 
/*CallableStatement stmt=con.prepareCall("{call insertproc(?,?)}");  
stmt.setInt(1,7890);  
stmt.setString(2,"komal");  
stmt.execute();  
  */
System.out.println("success");  
}  
}

//package pac;

import java.sql.*;  
public class tadaydate {  
public static void main(String[] args) throws Exception{  
  

	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/edubridge?characterEncoding=utf8","root","root");
	

CallableStatement stmt=con.prepareCall("{?= call Func_Calculate_Age(?)}");

stmt.registerOutParameter(1,Types.INTEGER); 
stmt.setDate(2,new Date(2002,02,02));

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
